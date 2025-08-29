package com.football.football.GatewayLayer.implementation;

import com.football.football.ControllerLayer.Models.MatchScoreDetails;
import com.football.football.DomainLayer.DTO.MatchScoreDetails.MatchScoreDetailsDTO;
import com.football.football.GatewayLayer.Mappers.IMapMatchScoreDetailsToMatchScoreDetailsDTO;
import com.football.football.GatewayLayer.interfaces.IMatchDetailsDelegate;
import com.football.football.ServiceLayer.logic.*;

import javax.inject.Inject;
import java.util.List;

public class MatchDetailsDelegate implements IMatchDetailsDelegate {

    @Inject
    private GetDetailsStep getDetailsStep;

    @Inject
    private GetAllMatchDetailsStep getAllMatchDetailsStep;

    @Inject
    private AddMatchDetailsStep addMatchDetailsStep;

    @Inject
    private DeleteMatchDetailsStep deleteMatchDetailsStep;

    @Inject
    private UpdateMatchDetailsStep updateMatchDetailsStep;

    @Inject
    private IMapMatchScoreDetailsToMatchScoreDetailsDTO mapMatchScoreDetailsToMatchScoreDetailsDTO;

    @Override
    public MatchScoreDetailsDTO getDetails(Long matchId) {
        return getDetailsStep.getDetails(matchId);
    }

    @Override
    public List<MatchScoreDetailsDTO> getAllMatchDetails() {
        return getAllMatchDetailsStep.getAllMatchDetails();
    }

    @Override
    public void addDetails(MatchScoreDetails matchScoreDetails) {
        addMatchDetailsStep.addMatchDetails(mapMatchScoreDetailsToMatchScoreDetailsDTO.map(matchScoreDetails));
    }

    @Override
    public void deleteDetails(Long matchId) {
        deleteMatchDetailsStep.deleteMatchDetails(matchId);
    }

    @Override
    public void updateDetails(Long matchId, MatchScoreDetails matchScoreDetails) {
        updateMatchDetailsStep.updateMatchDetails(matchId, matchScoreDetails);
    }

}
