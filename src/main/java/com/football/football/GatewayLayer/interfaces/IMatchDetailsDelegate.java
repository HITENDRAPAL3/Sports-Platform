package com.football.football.GatewayLayer.interfaces;

import com.football.football.ControllerLayer.Models.MatchScoreDetails;
import com.football.football.DomainLayer.DTO.MatchScoreDetails.MatchScoreDetailsDTO;

import java.util.List;

public interface IMatchDetailsDelegate {
    MatchScoreDetailsDTO getDetails(Long matchId);
    List<MatchScoreDetailsDTO> getAllMatchDetails();
    void addDetails(MatchScoreDetails matchScoreDetails);
    void deleteDetails(Long matchId);
    void updateDetails(Long matchId, MatchScoreDetails matchScoreDetails);
}
