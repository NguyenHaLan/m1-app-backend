package htwberlin.webtech.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import jakarta.persistence.*;

@SpringBootApplication(scanBasePackages = {"persistence", "service","api"})
public class WebtechApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebtechApplication.class, args);
	}
}
