package com.qa.jdbc_example.single_entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.qa.jdbc_example.JdbcUtils;
import com.qa.jdbc_example.User;

public class UserDAO {

	public List<User> findAll() {
		try (Connection conn = JdbcUtils.getConnection();
				Statement stmt = conn.createStatement();) {
			
			String SQL = "SELECT * FROM user";
			ResultSet rs = stmt.executeQuery(SQL);
			
			List<User> users = new ArrayList<>();
			
			while (rs.next()) {
				User user = this.unwrap(rs);
				users.add(user);
			}
			return users;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public User findById(long id) {
		try (Connection conn = JdbcUtils.getConnection(); 
			 Statement stmt = conn.createStatement();) {
			String SQL = "SELECT * FROM user WHERE id = " + id; // we need to use PreparedStatements instead to be safe
			
			// execute SQL against the database, using the stmt object
			ResultSet rs = stmt.executeQuery(SQL); // executeQuery() is used for reading from the database
			
			if (rs.next()) {
				// The returned ResultSet, rs, holds the User data
				// - use a helper method to unwrap the result set and create a user instance
				User user = this.unwrap(rs);
				return user;
			}	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void create(User user) {		
		// the ? represents a placeholder for a value
		String sql = "INSERT INTO user (forename, surname, age) VALUES (?,?,?)";
		// get connection
		// - Connection instances are closeable resources (we must call .close when we
		// are done)
		try (Connection conn = JdbcUtils.getConnection(); 
			 PreparedStatement ps = conn.prepareStatement(sql);) {
			// To execute SQL against a database, we must create either a Statement,
			// PreparedStatement or CallableStatement
			// - Statement is for reading from the DB (unsafe for data parameters, create
			// query with data included)
			// - PreparedStatement is for reading using prepared SQL statements (create the
			// query first, send the data later), protects against SQL injection
			// - CallableStatement is for calling stored procedures on your MySQL server
			// (essentially calling a function)
			
			// we need to bind the data to the query
			// - call the ps.setXXXX() methods with the index of the parameter in the sql query and the data to bind
			// - when preparing parameters, start from 1
			ps.setString(1, user.getForename());
			ps.setString(2, user.getSurname());
			ps.setInt(3, user.getAge());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public User update(User user) {
		// TODO: Implement me
		return null;
	}

	public boolean deleteById(long id) {
		// TODO: Implement me
		return false;
	}
	
	private User unwrap(ResultSet rs) throws SQLException {
		// ResultSets start 1 position before our entities
		// - this means we need to call rs.next() once before it points at the first entity
		User user = new User();
		
		// use a getXXXX() method to retrieve data, pass in the field name as a parameter
		Long id = rs.getLong("id");
		String forename = rs.getString("forename");
		String surname = rs.getString("surname");
		int age = rs.getInt("age");
		
		user.setId(id);
		user.setForename(forename);
		user.setSurname(surname);
		user.setAge(age);
		return user;
	}
}
