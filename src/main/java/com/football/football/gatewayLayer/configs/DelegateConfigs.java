package com.football.football.gatewayLayer.configs;

import com.football.football.gatewayLayer.implementation.AddCommentDelegate;
import com.football.football.gatewayLayer.implementation.GetDetailsDelegate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DelegateConfigs {

    @Bean
    public GetDetailsDelegate getDetailsDelegate() {
        return new GetDetailsDelegate();
    }

    @Bean
    public AddCommentDelegate addCommentDelegate() {
        return new AddCommentDelegate();
    }

}
