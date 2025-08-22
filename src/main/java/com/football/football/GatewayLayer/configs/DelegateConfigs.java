package com.football.football.GatewayLayer.configs;

import com.football.football.GatewayLayer.implementation.AddCommentDelegate;
import com.football.football.GatewayLayer.implementation.GetDetailsDelegate;
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
