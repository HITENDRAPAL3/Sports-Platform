package com.football.football.ServiceLayer.logic;

import com.football.football.DomainLayer.DTO.MatchScoreDetails.MatchScoreDetailsDTO;
import com.football.football.PersistenceLayer.FootballRepo;
import com.football.football.PersistenceLayer.mapper.IMatchScoreDetailsMapper;

import javax.inject.Inject;

public class AddMatchDetailsStep {

    @Inject
    private IMatchScoreDetailsMapper matchScoreDetailsMapper;

    @Inject
    private FootballRepo footballRepo;

    public void addMatchDetails(MatchScoreDetailsDTO matchScoreDetailsDTO) {
        footballRepo.save(matchScoreDetailsMapper.toEntity(matchScoreDetailsDTO));
    }
}
