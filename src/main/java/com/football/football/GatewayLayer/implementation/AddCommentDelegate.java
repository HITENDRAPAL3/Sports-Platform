package com.football.football.GatewayLayer.implementation;

import com.football.football.DomainLayer.DTO.MatchCommentDTOs.MatchCommentDTO;
import com.football.football.GatewayLayer.interfaces.IAddCommentDelegate;
import com.football.football.ServiceLayer.logic.AddCommentPublishStep;

import javax.inject.Inject;

public class AddCommentDelegate implements IAddCommentDelegate {

    @Inject
    private AddCommentPublishStep addCommentPublishStep;

    @Override
    public boolean addComment(MatchCommentDTO comment) {
        return addCommentPublishStep.publishComment(comment);
    }
}