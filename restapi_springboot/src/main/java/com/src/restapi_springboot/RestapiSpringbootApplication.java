package com.src.restapi_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RestapiSpringbootApplication{
	public static void main(String[] args) {
		SpringApplication.run(RestapiSpringbootApplication.class, args);
	}

	// @Autowired
	// private EmpRepository empRepository;

	// @Override
	// public void run(String... args) throws Exception {
	// 	// TODO Auto-generated method stub

	// 	// EmpEntity empEntity = new EmpEntity();
	// 	// empEntity.setFirstName("sengohn");
	// 	// empEntity.setLastName("data");
	// 	// empEntity.setEmail("Senghong@gmail.com");

	// 	// empRepository.save(empEntity);

	// }

}
