package com.football.football.PersistenceLayer.mapper;

import com.football.football.DomainLayer.DTO.MatchScoreDetails.MatchScoreDetailsDTO;
import com.football.football.PersistenceLayer.jpa.MatchScoreDetailsJPA;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IMatchScoreDetailsMapper {
    MatchScoreDetailsJPA toEntity(MatchScoreDetailsDTO dto);
    MatchScoreDetailsDTO toDTO(MatchScoreDetailsJPA jpa);
}

