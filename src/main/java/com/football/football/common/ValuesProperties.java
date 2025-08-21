package com.football.football.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "app.configs")
public class ValuesProperties {
    private String kafkaTopicName;
}
