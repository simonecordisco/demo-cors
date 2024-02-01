package co.cors.democors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DemoCorsApplication {
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/v1/getname").allowedOrigins("http://localhost:8080");
				registry.addMapping("/v1/createreversedname").allowedOrigins("http://localhost:8080");
				registry.addMapping("/v1/getname").allowedOrigins("http://localhost:9000");
				registry.addMapping("/v1/createreversedname").allowedOrigins("http://localhost:9000");
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoCorsApplication.class, args);
	}

}
