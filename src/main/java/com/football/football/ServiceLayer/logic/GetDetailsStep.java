package com.football.football.ServiceLayer.logic;

import com.football.football.DomainLayer.DTO.MatchScoreDetails.MatchScoreDetailsDTO;

public class GetDetailsStep {

    public MatchScoreDetailsDTO getDetails(String matchId) {
        return new MatchScoreDetailsDTO();
    }

}
