package com.football.football.Common.config;

import com.football.football.Common.ValuesProperties;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@AutoConfiguration
@EnableConfigurationProperties({ValuesProperties.class})
public class propertiesConfig {

}
