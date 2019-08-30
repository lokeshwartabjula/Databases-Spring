package com.example.demo.test;

import static org.mockito.Mockito.when;
//import static org.springframework.test.web.client.match.MockRestResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.controller.WelcomeController;
import com.example.demo.services.LoanEligibility;

@RunWith(SpringRunner.class)
public class TestWelcomeController {
	
	@Mock
	private LoanEligibility service;
	private MockMvc mock;
	@InjectMocks
	private WelcomeController controller;
	@Before
	public void setup() {
		this.mock=MockMvcBuilders.standaloneSetup(controller).build();
	}
	@Test
	public void testGetMessage() throws Exception {
//		mock.perform(get("/greet")).andExpect(status().isOk()).andExpect(content().string("testing"));
		mock.perform(get("/greet")).andExpect(status().isOk()).andExpect( content().string("testing"));
		
	}
	@Test
	public  void testGetEligibility() throws Exception{
		when(service.checkEligibility(300000.0, "govt")).thenReturn(500000.0);
		mock.perform(get("/check").param("yearlyIncome", 300000.))
	}
}
