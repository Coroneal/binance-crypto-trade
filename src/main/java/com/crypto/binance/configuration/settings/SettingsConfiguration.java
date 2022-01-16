package com.crypto.binance.configuration.settings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.crypto.binance.business.settings.SettingService;
import com.crypto.binance.business.settings.domain.SettingsRepository;

@Configuration
public class SettingsConfiguration {

    @Bean
    public SettingsRepository settingsRepository() {
        return new SettingsRepository();
    }

    @Bean
    public SettingService settingService(final SettingsRepository settingsRepository) {
        return SettingService.of(settingsRepository);
    }

}
