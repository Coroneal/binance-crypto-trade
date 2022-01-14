package com.crypto.binance.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.crypto.binance.configuration.openapi.OpenApiConfiguration;
import com.crypto.binance.configuration.security.SecurityConfiguration;

@Configuration
@Import({
            OpenApiConfiguration.class,
            SecurityConfiguration.class
        })
public class ApplicationConfiguration {

}