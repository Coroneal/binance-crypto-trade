package com.crypto.binance.endpoints.settings;

import com.crypto.binance.business.settings.domain.TradingMode;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema(description = "General bot settings")
public record BotSettingsApi(
    @Schema(description = "Trade with binance or use bot in testing mode")
    TradingMode tradingMode
) {}
