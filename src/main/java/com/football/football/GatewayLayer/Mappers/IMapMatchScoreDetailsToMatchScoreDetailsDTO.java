package com.football.football.GatewayLayer.Mappers;

import com.football.football.ControllerLayer.Models.MatchScoreDetails;
import com.football.football.DomainLayer.DTO.MatchScoreDetails.MatchScoreDetailsDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IMapMatchScoreDetailsToMatchScoreDetailsDTO {
    MatchScoreDetailsDTO map(MatchScoreDetails matchScoreDetails);
}
