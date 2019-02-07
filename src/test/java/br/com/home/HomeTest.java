package br.com.home;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * 
 * @author jpjava
 *	
 *	It was created this class describing the life Cycle of tests using Junit + Mock + Hamcrest
 *
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class HomeTest {
	
	private static Logger log = Logger.getLogger(HomeTest.class);
	
	@Autowired
	private MockMvc mockMvc;
	
	@Before
	public void beforeExecution(){
		log.info("Before Test");
	}
	
	@Test
	public void running() throws Exception{
		log.info("Run Test");
		
		mockMvc.perform(get("/home")).andExpect(status().isOk())
			.andExpect(content().string(containsString("Dev")));
	}
	
	@After
	public void afterExecution(){
		log.info("After Test");
	}
	
}
