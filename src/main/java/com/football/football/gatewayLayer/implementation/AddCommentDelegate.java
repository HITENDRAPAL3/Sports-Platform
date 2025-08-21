package com.football.football.gatewayLayer.implementation;

import com.football.football.gatewayLayer.interfaces.IAddCommentDelegate;
import com.football.football.serviceLayer.logic.AddCommentPublishStep;

import javax.inject.Inject;

public class AddCommentDelegate implements IAddCommentDelegate {

    @Inject
    private AddCommentPublishStep addCommentPublishStep;

    @Override
    public boolean addComment(String comment) {
        return addCommentPublishStep.publishComment(comment);
    }
}