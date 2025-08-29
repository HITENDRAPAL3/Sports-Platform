package com.football.football.PersistenceLayer.mapper;

import com.football.football.DomainLayer.DTO.MatchScoreDetails.MatchScoreDetailsDTO;
import com.football.football.PersistenceLayer.jpa.MatchScoreDetailsJPA;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMatchScoreDetailsMapper {
    MatchScoreDetailsJPA toEntity(MatchScoreDetailsDTO dto);
    List<MatchScoreDetailsDTO> toDTO(List<MatchScoreDetailsJPA> jpa);
    MatchScoreDetailsDTO toDTO(MatchScoreDetailsJPA jpa);
}

