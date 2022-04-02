package com.tarasovic.demo;

import com.tarasovic.demo.entities.Application;
import com.tarasovic.demo.repository.ApplicationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/*
 * Shorthand for @SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan
 */
@SpringBootApplication
@Slf4j
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*@Bean
	CommandLineRunner demo(ApplicationRepository applicationRepository){
		return args -> {
			applicationRepository.save(Application.builder().name("Trackzilla").owner("lord.dracula").description("pomoc").build());
			applicationRepository.save(Application.builder().name("Expenses").owner("kral.melisko").description("help").build());
			applicationRepository.save(Application.builder().name("Notification").owner("stefan.beispiel").description("hilfe").build());

			applicationRepository.findAll().forEach(System.out::println);
		};
	}*/
}
