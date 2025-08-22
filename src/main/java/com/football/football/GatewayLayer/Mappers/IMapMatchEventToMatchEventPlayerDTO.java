package com.football.football.GatewayLayer.Mappers;

import com.football.football.ControllerLayer.Models.MatchEvent;
import com.football.football.DomainLayer.DTO.MatchEventDTOs.MatchEventPlayerDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IMapMatchEventToMatchEventPlayerDTO {
    MatchEventPlayerDTO map(MatchEvent matchEvent);
}