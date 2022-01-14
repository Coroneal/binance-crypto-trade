package com.crypto.binance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.crypto.binance.configuration.ApplicationConfiguration;

@SpringBootApplication
@Import(ApplicationConfiguration.class)
public class CryptoBinanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CryptoBinanceApplication.class, args);
    }

}
