package com.udacity.vehicles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .build()
                .useDefaultResponseMessages(false);
    }

    ApiInfo apiInfo() {
        return new ApiInfo("Vehicle API", "REST API for vehicles communicating with Maps service to retrieve location and Price microservice to retrieve pricing",
                "1.0", "www.testurl.com/terms-of-service", new Contact("Milena Mankowska", "www.testurl.com", "milena@testmail.com"),
                "License of API", "www.testurl.com/license", Collections.emptyList());
    }
}
