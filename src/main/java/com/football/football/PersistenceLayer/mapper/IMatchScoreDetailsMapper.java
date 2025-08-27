package com.football.football.PersistenceLayer.mapper;

import com.football.football.DomainLayer.DTO.MatchScoreDetails.MatchScoreDetailsDTO;
import com.football.football.PersistenceLayer.jpa.MatchScoreDetailsJPA;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IMatchScoreDetailsMapper {

    IMatchScoreDetailsMapper INSTANCE = Mappers.getMapper(IMatchScoreDetailsMapper.class);

    @Mapping(target = "homeTeam", source = "homeTeam")
    @Mapping(target = "awayTeam", source = "awayTeam")
    MatchScoreDetailsJPA toEntity(MatchScoreDetailsDTO dto);

    @Mapping(target = "homeTeam", source = "homeTeam")
    @Mapping(target = "awayTeam", source = "awayTeam")
    MatchScoreDetailsDTO toDTO(MatchScoreDetailsJPA entity);

    // Mapping nested TeamInfoDTO to TeamInfoEmbeddable
    MatchScoreDetailsJPA.TeamInfoEmbeddable mapToEmbeddable(MatchScoreDetailsDTO.TeamInfoDTO dto);

    // Mapping nested TeamInfoEmbeddable to TeamInfoDTO
    MatchScoreDetailsDTO.TeamInfoDTO mapToDTO(MatchScoreDetailsJPA.TeamInfoEmbeddable embeddable);

    MatchScoreDetailsJPA map(MatchScoreDetailsDTO matchScoreDetailsDTO);

}
