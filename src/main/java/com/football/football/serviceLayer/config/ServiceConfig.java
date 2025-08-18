package com.football.football.serviceLayer.config;

import com.football.football.serviceLayer.logic.GetDetailsStep;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ServiceConfig {

    @Bean
    public GetDetailsStep getDetailsStep() {
        return new GetDetailsStep();
    }

}
