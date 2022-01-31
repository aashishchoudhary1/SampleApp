package myfirstproject.sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

@SpringBootTest
class SampleApplicationTests {

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();

	}
	
	@Test
	void testBeans() {
		assertThat(controller).isNotNull();

	}

	
	@Autowired
	private MyController controller;

	

}
