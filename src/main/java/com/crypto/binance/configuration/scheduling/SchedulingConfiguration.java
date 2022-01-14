package com.crypto.binance.configuration.scheduling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.crypto.binance.business.market.MarketRecordsScheduler;

@Configuration
@EnableScheduling
public class SchedulingConfiguration {

    @Bean
    public MarketRecordsScheduler marketRecordsScheduler() {
        return new MarketRecordsScheduler();
    }

}
