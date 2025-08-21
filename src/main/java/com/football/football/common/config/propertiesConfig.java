package com.football.football.common.config;

import com.football.football.common.ValuesProperties;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@AutoConfiguration
@EnableConfigurationProperties({ValuesProperties.class})
public class propertiesConfig {

}
