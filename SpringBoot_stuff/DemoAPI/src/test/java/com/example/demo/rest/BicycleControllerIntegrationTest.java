package com.example.demo.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.demo.BicyclesExample.entity.Bicycles;
import com.fasterxml.jackson.databind.ObjectMapper;


@SpringBootTest
@AutoConfigureMockMvc
@Sql(scripts = { "classpath:Bicycles-schema.sql", "classpath:Bicycles-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("test")
public class BicycleControllerIntegrationTest {

	@Autowired
	private MockMvc mvc;

	@Autowired
	private ObjectMapper mapper;

	@Test
	void testCreate() throws Exception {
		Bicycles testBike = new Bicycles("Allez", "Specialized", 2021);
		String testBikeAsJSON = this.mapper.writeValueAsString(testBike);
		RequestBuilder req = post("/createBicycles").content(testBikeAsJSON).contentType(MediaType.APPLICATION_JSON);

		ResultMatcher checkStatus = MockMvcResultMatchers.status().isCreated();
		Bicycles createBike = new Bicycles(2, "Allez", "Specialized", 2021);
		String createdBikeAsJSON = this.mapper.writeValueAsString(createBike);
		ResultMatcher checkBody = MockMvcResultMatchers.content().json(createdBikeAsJSON);

		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
	
	@Test
	void testRead() throws Exception {
		List<Bicycles> bikes = List.of(new Bicycles(1, "DogmaF12", "Pinarello", 2022));
		this.mvc.perform(get("/getBicycles")).andExpect(status().isOk())
				.andExpect(content().json(this.mapper.writeValueAsString(bikes)));
	}
	
	@Test
	void testUpdate() throws Exception {
		Bicycles updated = new Bicycles (1, "Tarmac", "SWorks", 2022);
		this.mvc.perform(patch("/updateBicycles/1?model=Tarmac&brand=SWorks&releaseYear=2022")).andExpect(status().isOk())
				.andExpect(content().json(this.mapper.writeValueAsString(updated)));
	}
	
	@Test
	void testDelete() throws Exception {
		this.mvc.perform(delete("/removeBicycles/1")).andExpect(status().isNoContent());
	}
}
