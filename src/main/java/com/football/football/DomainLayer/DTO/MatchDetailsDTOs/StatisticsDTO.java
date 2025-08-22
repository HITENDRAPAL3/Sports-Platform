package com.football.football.DomainLayer.DTO.MatchDetailsDTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StatisticsDTO {
    private Integer possessionHome;
    private Integer possessionAway;
    private Integer shotsHome;
    private Integer shotsAway;
    private Integer foulsHome;
    private Integer foulsAway;
    private Integer cornersHome;
    private Integer cornersAway;
}