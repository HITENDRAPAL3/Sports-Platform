package com.football.football.ServiceLayer.config;

import com.football.football.ServiceLayer.logic.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public GetDetailsStep getDetailsStep() {
        return new GetDetailsStep();
    }

    @Bean
    public AddMatchDetailsStep addMatchDetailsStep() {
        return new AddMatchDetailsStep();
    }

    @Bean
    public DeleteMatchDetailsStep deleteMatchDetailsStep() {
        return new DeleteMatchDetailsStep();
    }

    @Bean
    public UpdateMatchDetailsStep updateMatchDetailsStep() {
        return new UpdateMatchDetailsStep();
    }

    @Bean
    public AddCommentsAndEventsPublishStep addCommentPublishStep() {
        return new AddCommentsAndEventsPublishStep();
    }

    @Bean
    public GetAllMatchDetailsStep getAllMatchDetailsStep() {
        return new GetAllMatchDetailsStep();
    }
}
