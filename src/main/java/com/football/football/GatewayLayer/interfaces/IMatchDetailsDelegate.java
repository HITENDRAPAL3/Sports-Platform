package com.football.football.GatewayLayer.interfaces;

import com.football.football.ControllerLayer.Models.MatchScoreDetails;
import com.football.football.DomainLayer.DTO.MatchScoreDetails.MatchScoreDetailsDTO;

public interface IMatchDetailsDelegate {
    MatchScoreDetailsDTO getDetails(Long matchId);
    void addDetails(MatchScoreDetails matchScoreDetails);
    void deleteDetails(Long match);
}
