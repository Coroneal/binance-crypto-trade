package com.crypto.binance.interceptors;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class SecretCheckingInterceptor implements HandlerInterceptor {

    private static final String SECRET_PARAMETER = "secret";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        final String secretValue = extractSecretValue(request);
        if(!secretValue.equals("test")) {
            throw new InvalidParameterException("Security exception");
        }
        return false;
    }

    private String extractSecretValue(final HttpServletRequest request) {
        final Map<String, String[]> parametersMap = request.getParameterMap();
        return Arrays.stream(parametersMap.get(SECRET_PARAMETER))
                     .findFirst()
                     .orElseThrow();
    }

}

