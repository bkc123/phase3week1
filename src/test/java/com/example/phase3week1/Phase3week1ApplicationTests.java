package com.example.phase3week1;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.phase3week1.model.User;
import com.example.phase3week1.service.UserService;

@SpringBootTest
class Phase3week1ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testGetUser() {
		UserService service = new UserService();
		List <User>  user = service.retriveUser("First");
		assertThat(user.size()==1);
		
	}


}
