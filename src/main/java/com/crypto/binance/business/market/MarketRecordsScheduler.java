package com.crypto.binance.business.market;

import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MarketRecordsScheduler {

    @Async
    @Scheduled(fixedRateString = "${crypto.searching.interval-seconds}", timeUnit = TimeUnit.SECONDS)
    public void searchRecords() {
        System.out.println("Fixed rate task async - " + System.currentTimeMillis() / 1000);
    }

}
