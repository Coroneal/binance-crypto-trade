package com.crypto.binance.business.settings.domain;

import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
public class SettingsRepository {

    private TradingMode tradingMode = TradingMode.OFFLINE;
}
