package com.football.football.DomainLayer.DTO.MatchDetailsDTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GoalDTO {
    private Integer minute;
    private String team;
    private String player;
}