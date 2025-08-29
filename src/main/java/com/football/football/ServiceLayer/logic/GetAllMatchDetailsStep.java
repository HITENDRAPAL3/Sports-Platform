package com.football.football.ServiceLayer.logic;

import com.football.football.DomainLayer.DTO.MatchScoreDetails.MatchScoreDetailsDTO;
import com.football.football.PersistenceLayer.FootballRepo;
import com.football.football.PersistenceLayer.mapper.IMatchScoreDetailsMapper;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class GetAllMatchDetailsStep {

    @Inject
    private IMatchScoreDetailsMapper matchScoreDetailsMapper;

    @Inject
    private FootballRepo footballRepo;

    public List<MatchScoreDetailsDTO> getAllMatchDetails() {
        try {
            return matchScoreDetailsMapper.toDTO(footballRepo.findAll());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

}
