package com.football.football.ServiceLayer.logic;

import com.football.football.ControllerLayer.Models.MatchScoreDetails;
import com.football.football.PersistenceLayer.FootballRepo;
import com.football.football.PersistenceLayer.jpa.MatchScoreDetailsJPA;

import javax.inject.Inject;

public class UpdateMatchDetailsStep {

    @Inject
    private FootballRepo footballRepo;

    public void updateMatchDetails(Long matchId, MatchScoreDetails matchScoreDetails) {
        MatchScoreDetailsJPA existingMatch = footballRepo.findByMatchId(matchId);

        if (existingMatch != null) {
            if (matchScoreDetails.getAwayTeamName() != null) {
                existingMatch.setAwayTeamName(matchScoreDetails.getAwayTeamName());
            }
            if (matchScoreDetails.getAwayTeamScore() != null) {
                existingMatch.setAwayTeamScore(matchScoreDetails.getAwayTeamScore());
            }
            if (matchScoreDetails.getHomeTeamName() != null) {
                existingMatch.setHomeTeamName(matchScoreDetails.getHomeTeamName());
            }
            if (matchScoreDetails.getHomeTeamScore() != null) {
                existingMatch.setHomeTeamScore(matchScoreDetails.getHomeTeamScore());
            }
            footballRepo.save(existingMatch);
        } else {
            throw new RuntimeException(String.format("Match with ID : %s not found", matchId));
        }
    }

}
