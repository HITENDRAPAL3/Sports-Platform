package com.football.football.GatewayLayer.configs;

import com.football.football.GatewayLayer.implementation.AddCommentsAndEventsDelegate;
import com.football.football.GatewayLayer.implementation.MatchDetailsDelegate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DelegateConfigs {

    @Bean
    public MatchDetailsDelegate getDetailsDelegate() {
        return new MatchDetailsDelegate();
    }

    @Bean
    public AddCommentsAndEventsDelegate addCommentDelegate() {
        return new AddCommentsAndEventsDelegate();
    }

}
