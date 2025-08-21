package com.football.football.serviceLayer.logic;

import com.football.football.AsyncMessaging.service.KafkaService;

import javax.inject.Inject;

public class AddCommentPublishStep {

    @Inject
    private KafkaService kafkaService;

    public boolean publishComment(String comment) {
        return kafkaService.publishMsg(comment);
    }

}