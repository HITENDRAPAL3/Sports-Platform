package com.football.football.AsyncMessaging.config;

import com.football.football.common.AppConstants;
import com.football.football.common.ValuesProperties;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import javax.inject.Inject;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(AppConstants.TOPIC_NAME)
                .partitions(3)
                .build();
    }

}

