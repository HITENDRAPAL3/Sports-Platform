package com.football.football.DomainLayer.DTO.MatchEventDTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

@Getter
@Setter
@ToString
public class MatchEventPlayerDTO {
    private String matchId;
    private String eventId;
    private Instant timestamp;
    private Integer minute;
    private String eventType;
    private String team;
    private String player;
    private String description;
    private String additionalInfo;
}