package com.football.football.AsyncMessaging.service;

import com.football.football.Common.AppConstants;
import com.football.football.DomainLayer.DTO.MatchCommentDTOs.MatchCommentDTO;
import com.football.football.DomainLayer.DTO.MatchEventDTOs.MatchEventPlayerDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class KafkaService {

    @Inject
    private KafkaTemplate<String, MatchCommentDTO> kafkaTemplateForComment;

    @Inject
    private KafkaTemplate<String, MatchEventPlayerDTO> kafkaTemplateForEvent;

    private static final Logger logger = LoggerFactory.getLogger(KafkaService.class);

    public boolean publishMsg(MatchCommentDTO msg) {
        try {
            this.kafkaTemplateForComment.send(AppConstants.TOPIC_NAME, msg);
            logger.info("Message sent successfully");
        } catch (Exception e) {
            logger.error("Failed to send Message");
            return false;
        }
        return true;
    }

    public boolean publishMsg(MatchEventPlayerDTO msg) {
        try {
            this.kafkaTemplateForEvent.send(AppConstants.TOPIC_NAME, msg);
            logger.info("Message sent successfully");
        } catch (Exception e) {
            logger.error("Failed to send Message");
            return false;
        }
        return true;
    }

}
