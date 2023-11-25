package edu.fra.uas.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@SpringBootApplication
public class HelloApplication {

	@PostConstruct
    public void initData() {
        // Dateninitialisierung
    }

    @PreDestroy
    public void cleanUp() {
        // Aufräumarbeiten vor der Zerstörung der Bean
    }

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
