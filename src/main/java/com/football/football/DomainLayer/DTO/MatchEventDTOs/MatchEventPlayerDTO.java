package com.football.football.DomainLayer.DTO.MatchEventDTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class MatchEventPlayerDTO {
    private String matchId;
    private String eventId;
    private LocalDateTime timestamp;
    private Integer minute;
    private String eventType;
    private TeamEventDTO team;
    private PlayerEventDTO player;
    private String description;
    private AdditionalInfoDTO additionalInfo;
}