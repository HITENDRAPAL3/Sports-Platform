package com.football.football.DomainLayer.DTO.MatchDetailsDTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TeamDTO {
    private String id;
    private String name;
    private Integer score;
}