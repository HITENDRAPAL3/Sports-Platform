package com.football.football.GatewayLayer.implementation;

import com.football.football.ControllerLayer.Models.MatchComment;
import com.football.football.ControllerLayer.Models.MatchEvent;
import com.football.football.GatewayLayer.Mappers.IMapMatchCommentToMatchCommentDTO;
import com.football.football.GatewayLayer.Mappers.IMapMatchEventToMatchEventPlayerDTO;
import com.football.football.GatewayLayer.interfaces.IAddCommentDelegate;
import com.football.football.ServiceLayer.logic.AddCommentPublishStep;

import javax.inject.Inject;

public class AddCommentDelegate implements IAddCommentDelegate {

    @Inject
    private AddCommentPublishStep addCommentPublishStep;

    @Inject
    private IMapMatchEventToMatchEventPlayerDTO mapMatchEventToMatchEventPlayerDTO;

    @Inject
    private IMapMatchCommentToMatchCommentDTO mapMatchCommentToMatchCommentDTO;

    @Override
    public boolean addComment(MatchComment comment) {
        return addCommentPublishStep.publishComment(mapMatchCommentToMatchCommentDTO.map(comment));
    }

    @Override
    public boolean addEvent(MatchEvent event) {
        return addCommentPublishStep.publishEvent(mapMatchEventToMatchEventPlayerDTO.map(event));
    }

}