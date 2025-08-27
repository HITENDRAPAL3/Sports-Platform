package com.football.football.GatewayLayer.implementation;

import com.football.football.ControllerLayer.Models.MatchScoreDetails;
import com.football.football.DomainLayer.DTO.MatchScoreDetails.MatchScoreDetailsDTO;
import com.football.football.GatewayLayer.Mappers.IMapMatchScoreDetailsToMatchScoreDetailsDTO;
import com.football.football.GatewayLayer.interfaces.IMatchDetailsDelegate;
import com.football.football.ServiceLayer.logic.AddMatchDetailsStep;
import com.football.football.ServiceLayer.logic.GetDetailsStep;

import javax.inject.Inject;

public class MatchDetailsDelegate implements IMatchDetailsDelegate {

    @Inject
    private GetDetailsStep getDetailsStep;

    @Inject
    private AddMatchDetailsStep addMatchDetailsStep;

    @Inject
    private IMapMatchScoreDetailsToMatchScoreDetailsDTO mapMatchScoreDetailsToMatchScoreDetailsDTO;

    @Override
    public MatchScoreDetailsDTO getDetails(String matchId) {
        return getDetailsStep.getDetails(matchId);
    }

    @Override
    public void addDetails(MatchScoreDetails matchScoreDetails) {
        addMatchDetailsStep.addMatchDetails(mapMatchScoreDetailsToMatchScoreDetailsDTO.map(matchScoreDetails));
    }

}
