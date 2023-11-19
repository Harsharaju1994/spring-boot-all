package com.in60minutes.springboot.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI basicOpenAPI(){
        return new OpenAPI().info(new Info()
                .title("Project Management")
                .version("3.1.2")
                        .description("Project app")
                );
    }
}
