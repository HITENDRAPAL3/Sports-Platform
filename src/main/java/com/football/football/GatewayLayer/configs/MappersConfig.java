package com.football.football.GatewayLayer.configs;

import com.football.football.GatewayLayer.Mappers.IMapMatchCommentToMatchCommentDTO;
import com.football.football.GatewayLayer.Mappers.IMapMatchCommentToMatchCommentDTOImpl;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class MappersConfig {

    @Bean
    public IMapMatchCommentToMatchCommentDTO mapMatchCommentToMatchCommentDTO() {
        return new IMapMatchCommentToMatchCommentDTOImpl();
    }

}
