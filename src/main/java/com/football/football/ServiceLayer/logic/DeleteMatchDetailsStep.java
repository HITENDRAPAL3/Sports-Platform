package com.football.football.ServiceLayer.logic;

import com.football.football.PersistenceLayer.FootballRepo;
import com.football.football.PersistenceLayer.jpa.MatchScoreDetailsJPA;

import javax.inject.Inject;

public class DeleteMatchDetailsStep {

    @Inject
    private FootballRepo footballRepo;

    public void deleteMatchDetails(Long matchId) {
        MatchScoreDetailsJPA existingMatch = footballRepo.findByMatchId(matchId);
        if (null != existingMatch) {
            footballRepo.delete(existingMatch);
        } else {
            throw new RuntimeException(String.format("%s%s%s", "Match with ID :", matchId, " not found"));
        }
    }

}
