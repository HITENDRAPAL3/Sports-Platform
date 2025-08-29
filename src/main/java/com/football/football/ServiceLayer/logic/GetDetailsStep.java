package com.football.football.ServiceLayer.logic;

import com.football.football.DomainLayer.DTO.MatchScoreDetails.MatchScoreDetailsDTO;
import com.football.football.PersistenceLayer.FootballRepo;
import com.football.football.PersistenceLayer.mapper.IMatchScoreDetailsMapper;

import javax.inject.Inject;

public class GetDetailsStep {

    @Inject
    private FootballRepo footballRepo;

    @Inject
    private IMatchScoreDetailsMapper matchScoreDetailsMapper;

    public MatchScoreDetailsDTO getDetails(Long matchId) {
        return matchScoreDetailsMapper.toDTO(footballRepo.findByMatchId(matchId));
    }

}
