package com.football.football.PersistenceLayer.mapper;

import com.football.football.DomainLayer.DTO.MatchScoreDetails.MatchScoreDetailsDTO;
import com.football.football.PersistenceLayer.jpa.MatchScoreDetailsJPA;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IMatchScoreDetailsMapper {

    MatchScoreDetailsJPA toEntity(MatchScoreDetailsDTO dto);
}
