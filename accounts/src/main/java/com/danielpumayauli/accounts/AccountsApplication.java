package com.danielpumayauli.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.danielpumayauli.accounts.dto.AccountsContactInfoDto;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.danielpumayauli.accounts.controller") })
@EnableJpaRepositories("com.danielpumayauli.accounts.repository")
@EntityScan("com.danielpumayauli.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "SpringBank Accounts microservice REST API Documentation",
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
				description =  "SpringBank Accounts microservice REST API Documentation",
				url = "https://www.danielpumayauli.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
