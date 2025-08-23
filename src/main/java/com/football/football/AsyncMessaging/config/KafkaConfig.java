package com.football.football.AsyncMessaging.config;

import com.football.football.Common.AppConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topicForMatchComments() {
        return TopicBuilder.name(AppConstants.TOPIC_NAME_FOR_MATCH_COMMENTS)
                .partitions(3)
                .build();
    }

    @Bean
    public NewTopic topicForMatchEvents() {
        return TopicBuilder.name(AppConstants.TOPIC_NAME_FOR_MATCH_EVENTS)
                .partitions(3)
                .build();
    }

}

