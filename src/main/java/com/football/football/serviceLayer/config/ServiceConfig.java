package com.football.football.serviceLayer.config;

import com.football.football.serviceLayer.logic.AddCommentPublishStep;
import com.football.football.serviceLayer.logic.GetDetailsStep;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public GetDetailsStep getDetailsStep() {
        return new GetDetailsStep();
    }

    @Bean
    public AddCommentPublishStep addCommentPublishStep() {
        return new AddCommentPublishStep();
    }
}
