package com.crypto.binance.configuration.interceptors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InterceptorsConfiguration {

    @Bean
    public InterceptorsConfigurer interceptorsConfigurer() {
        return new InterceptorsConfigurer();
    }

}
