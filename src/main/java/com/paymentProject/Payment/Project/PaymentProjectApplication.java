package com.paymentProject.Payment.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class PaymentProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentProjectApplication.class, args);
	}

	public Docket apis(){

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.paymentProject.Payment.Project")).build();

	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
