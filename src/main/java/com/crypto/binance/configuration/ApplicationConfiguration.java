package com.crypto.binance.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.crypto.binance.configuration.openapi.OpenApiConfiguration;
import com.crypto.binance.configuration.scheduling.SchedulingConfiguration;

@Configuration
@Import({
            OpenApiConfiguration.class,
            SchedulingConfiguration.class
        })
public class ApplicationConfiguration {

}