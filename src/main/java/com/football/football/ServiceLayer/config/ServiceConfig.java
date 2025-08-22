package com.football.football.ServiceLayer.config;

import com.football.football.ServiceLayer.logic.AddCommentPublishStep;
import com.football.football.ServiceLayer.logic.GetDetailsStep;
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
