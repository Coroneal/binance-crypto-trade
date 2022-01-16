package com.crypto.binance.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.crypto.binance.configuration.interceptors.InterceptorsConfiguration;
import com.crypto.binance.configuration.openapi.OpenApiConfiguration;
import com.crypto.binance.configuration.scheduling.SchedulingConfiguration;
import com.crypto.binance.configuration.settings.SettingsConfiguration;

@Configuration
@Import({
            OpenApiConfiguration.class,
            SchedulingConfiguration.class,
            SettingsConfiguration.class,
            InterceptorsConfiguration.class
        })
public class ApplicationConfiguration {

}