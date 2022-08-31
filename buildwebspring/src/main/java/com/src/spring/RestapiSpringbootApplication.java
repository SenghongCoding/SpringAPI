package com.src.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.src.spring.repository.implement.StudentRepositoryIml;

@SpringBootApplication
public class RestapiSpringbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestapiSpringbootApplication.class, args);
	}

	private StudentRepositoryIml studentRepositoryIml = new StudentRepositoryIml();

	// @Autowired
	// // private JdbcTemplate jdbcTemplate;
	//
	// @Override
	// public void run(String... args) throws Exception {
	//
	// ArrayList<Student> findStudents = studentRepositoryIml.findAllStudent();
	// for (Student student : findStudents) {
	// System.out.println(student.toString());
	// }
	//
	// }
}
