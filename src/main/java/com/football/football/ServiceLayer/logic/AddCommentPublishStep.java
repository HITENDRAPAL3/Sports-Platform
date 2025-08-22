package com.football.football.ServiceLayer.logic;

import com.football.football.AsyncMessaging.service.KafkaService;
import com.football.football.DomainLayer.DTO.MatchCommentDTOs.MatchCommentDTO;

import javax.inject.Inject;

public class AddCommentPublishStep {

    @Inject
    private KafkaService kafkaService;

    public boolean publishComment(MatchCommentDTO comment) {
        return kafkaService.publishMsg(comment);
    }

}