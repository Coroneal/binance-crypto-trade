package com.crypto.binance.configuration.openapi;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
    info = @Info(title = "Crypto Binance API", version = "1.0", description = "Api Information")
)
@Configuration
public class OpenApiConfiguration {

}
