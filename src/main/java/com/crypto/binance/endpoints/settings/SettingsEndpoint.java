package com.crypto.binance.endpoints.settings;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.crypto.binance.business.settings.SettingService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/settings")
public class SettingsEndpoint {

    @Autowired
    private SettingService settingService;

    @PostMapping
    @Operation(summary = "Set general bot settings.")
    @ApiResponse(responseCode = "200", description = "Approval schemas were sucessfully returned")
    public String index(final @RequestBody BotSettingsApi settings, final @RequestParam String secret) {
        settingService.update(settings);
        return "OK";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getCurrentTime() {
        return LocalDateTime.now().toString();
    }
}