package com.football.football.GatewayLayer.Mappers;

import com.football.football.ControllerLayer.Models.MatchScoreDetails;
import com.football.football.DomainLayer.DTO.MatchScoreDetails.MatchScoreDetailsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IMapMatchScoreDetailsToMatchScoreDetailsDTO {

    @Mapping(target = "homeTeam", source = "homeTeam")
    @Mapping(target = "awayTeam", source = "awayTeam")
    MatchScoreDetailsDTO map(MatchScoreDetails matchScoreDetails);

    @Mapping(target = "name", source = "name")
    @Mapping(target = "score", source = "score")
    MatchScoreDetailsDTO.TeamInfoDTO mapTeamInfo(MatchScoreDetails.TeamInfo teamInfo);
}
