package com.football.football.GatewayLayer.configs;

import com.football.football.GatewayLayer.Mappers.IMapMatchCommentToMatchCommentDTO;
import com.football.football.GatewayLayer.Mappers.IMapMatchCommentToMatchCommentDTOImpl;
import com.football.football.GatewayLayer.Mappers.IMapMatchEventToMatchEventPlayerDTO;
import com.football.football.GatewayLayer.Mappers.IMapMatchEventToMatchEventPlayerDTOImpl;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class MappersConfig {

    @Bean
    public IMapMatchCommentToMatchCommentDTO mapMatchCommentToMatchCommentDTO() {
        return new IMapMatchCommentToMatchCommentDTOImpl();
    }

    @Bean
    public IMapMatchEventToMatchEventPlayerDTO mapMatchEventToMatchEventPlayerDTO() {
        return new IMapMatchEventToMatchEventPlayerDTOImpl();
    }

}
