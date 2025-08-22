package com.football.football.DomainLayer.DTO.MatchDetailsDTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
public class MatchDetailsDTO {
    private String matchId;
    private LocalDateTime date;
    private String competition;
    private String stadium;
    private TeamDTO homeTeam;
    private TeamDTO awayTeam;
    private String status;
    private String referee;
    private List<EventDTO> events;
    private String finalResult;
    private List<GoalDTO> goals;
    private LineupsDTO lineups;
    private StatisticsDTO statistics;
}