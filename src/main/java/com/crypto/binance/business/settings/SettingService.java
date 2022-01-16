package com.crypto.binance.business.settings;

import com.crypto.binance.business.settings.domain.SettingsRepository;
import com.crypto.binance.endpoints.settings.BotSettingsApi;

import lombok.AllArgsConstructor;

@AllArgsConstructor(staticName = "of")
public class SettingService {

    private final SettingsRepository settingsRepository;

    public void update(final BotSettingsApi settings) {
        settingsRepository.setTradingMode(settings.tradingMode());
    }
}
