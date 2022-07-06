package com.example.demo.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.demo.BicyclesExample.entity.Bicycles;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
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
		Bicycles createBike = new Bicycles(1, "Allez", "Specialized", 2021);
		String createdBikeAsJSON = this.mapper.writeValueAsString(createBike);
		ResultMatcher checkBody = MockMvcResultMatchers.content().json(createdBikeAsJSON);

		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
}
