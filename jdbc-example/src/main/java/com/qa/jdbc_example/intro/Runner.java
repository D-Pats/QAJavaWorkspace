package com.qa.jdbc_example.intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.qa.jdbc_example.User;

public class Runner {
	
	// Setup variables for connecting to local MySQL instance
	// - Connection string format: jdbc:vendor://url:port/databaseName?parameters
	private static final String connectionUrl = "jdbc:mysql://localhost:3306/example?serverTimezone=UTC";
	private static final String username = "root";
	private static final String password = "root";
	
	// Database transaction steps:
	// 1. Get connection object
	// 2. Create and prepare a statement for execution
	// 3. Execute the statement and store the results in a variable
	// 4. If it is a result set, unwrap that result set into its values where
	//    a ResultSet is just a Java object representing a database table and its results
	// 5. Close the connection
	
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			// 1.
			conn = getConnection();
			
			// 2. through .4
			List<User> users = findAll(conn);
			users.forEach(System.out::println);
		} catch (SQLException e) {
			System.err.println("Something went wrong during the transaction");
		} finally {
			try {
				// 5.
				if (conn != null ){
					conn.close();
				}
			} catch (SQLException e) {
				System.err.println("Something went wrong closing the connection");
			}
		}
	}

	private static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(connectionUrl, username, password);
	}
	
	private static List<User> findAll(Connection conn) throws SQLException {
		// 2.
		Statement stmt = conn.createStatement();
		
		// 3.
		final String sql = "SELECT * FROM user";
		ResultSet rs = stmt.executeQuery(sql);
		
		// 4.
		List<User> users = unwrapSet(rs);
		
		return users;
	}

	private static List<User> unwrapSet(ResultSet rs) throws SQLException {
		List<User> users = new ArrayList<>();
		
		// iterate over the result set until nothing is left
		while (rs.next()) {
			User user = unwrap(rs);
			users.add(user);
		}
		return users;
	}

	private static User unwrap(ResultSet rs) throws SQLException {
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
