package com.crypto.binance.configuration.interceptors;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.crypto.binance.interceptors.SecretCheckingInterceptor;

public class InterceptorsConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SecretCheckingInterceptor());
    }
}
