package com.salesmanager.shop.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class DocumentationConfiguration {

	public static final Contact DEFAULT_CONTACT = new Contact()
		.name("Shopizer")
		.url("https://www.shopizer.com");
	
	private static final String HOST = "localhost:8080";

	/**
	 * http://localhost:8080/swagger-ui/index.html
	 * http://localhost:8080/v3/api-docs
	 */

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
			.addServersItem(new Server().url("http://" + HOST))
			.info(new Info()
				.title("Shopizer REST API")
				.description("API for Shopizer e-commerce. Contains public end points as well as private end points requiring basic authentication and remote authentication based on jwt bearer token. URL patterns containing /private/** use bearer token; those are authorized customer and administrators administration actions.")
				.version("1.0")
				.contact(DEFAULT_CONTACT))
			.components(new Components()
				.addSecuritySchemes("JWT", new SecurityScheme()
					.type(SecurityScheme.Type.HTTP)
					.scheme("bearer")
					.bearerFormat("JWT")))
			.addSecurityItem(new SecurityRequirement().addList("JWT"));
	}

}
