package com.crypto.binance.configuration.openapi;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
    info = @Info(title = "Employees API", version = "2.0", description = "Employees Information")
)
@Configuration
public class OpenApiConfiguration {

}
