package com.crypto.binance.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.crypto.binance.configuration.openapi.OpenApiConfiguration;

@Configuration
@Import(OpenApiConfiguration.class)
public class ApplicationConfiguration {

}