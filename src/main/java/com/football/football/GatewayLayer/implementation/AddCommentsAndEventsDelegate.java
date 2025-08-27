package com.football.football.GatewayLayer.implementation;

import com.football.football.ControllerLayer.Models.MatchComment;
import com.football.football.ControllerLayer.Models.MatchEvent;
import com.football.football.GatewayLayer.Mappers.IMapMatchCommentToMatchCommentDTO;
import com.football.football.GatewayLayer.Mappers.IMapMatchEventToMatchEventPlayerDTO;
import com.football.football.GatewayLayer.interfaces.IAddCommentsAndEventDelegate;
import com.football.football.ServiceLayer.logic.AddCommentsAndEventsPublishStep;

import javax.inject.Inject;

public class AddCommentsAndEventsDelegate implements IAddCommentsAndEventDelegate {

    @Inject
    private AddCommentsAndEventsPublishStep addCommentsAndEventsPublishStep;

    @Inject
    private IMapMatchEventToMatchEventPlayerDTO mapMatchEventToMatchEventPlayerDTO;

    @Inject
    private IMapMatchCommentToMatchCommentDTO mapMatchCommentToMatchCommentDTO;

    @Override
    public boolean addComment(MatchComment comment) {
        return addCommentsAndEventsPublishStep.publishComment(mapMatchCommentToMatchCommentDTO.map(comment));
    }

    @Override
    public boolean addEvent(MatchEvent event) {
        return addCommentsAndEventsPublishStep.publishEvent(mapMatchEventToMatchEventPlayerDTO.map(event));
    }

}