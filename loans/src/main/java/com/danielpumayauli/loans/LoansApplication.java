package com.danielpumayauli.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.danielpumayauli.loans.dto.LoansContactInfoDto;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.danielpumayauli.loans.controller") })
@EnableJpaRepositories("com.danielpumayauli.loans.repository")
@EntityScan("com.danielpumayauli.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "SpringBank Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Madan Reddy",
						email = "tutor@danielpumayauli.com",
						url = "https://www.danielpumayauli.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.danielpumayauli.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "SpringBank Loans microservice REST API Documentation",
				url = "https://www.danielpumayauli.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}
