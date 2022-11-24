package com.jmvv.back;

// import java.time.LocalDate;

// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;

// import com.jmvv.back.models.Person;
// import com.jmvv.back.repo.RepoPerson;

@SpringBootApplication
public class BackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackApplication.class, args);
	}
	// @Bean
	// CommandLineRunner run(RepoPerson repoPerson){
	// 	return args ->{
	// 		if (repoPerson.count()<1) {
	// 			System.out.println("iniciando DB");
	// 			Person samplPerson = new Person(
	// 				0,
	// 				"Jhon",
	// 				"Gibsom",
	// 				"dump",
	// 				"email@email.com",
	// 				LocalDate.parse("2000-01-01"),
	// 				3_000_001);
	// 			// repoPerson.save(samplPerson);
	// 		}
	// 	};
	// }
}
