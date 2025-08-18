package com.football.football.gatewayLayer.configs;

import com.football.football.gatewayLayer.implementation.GetDetailsDelegate;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class DelegateConfigs {

    @Bean
    public GetDetailsDelegate getDetailsDelegate() {
        return new GetDetailsDelegate();
    }

}
