package com.football.football.DomainLayer.DTO.MatchEventDTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PlayerEventDTO {
    private String id;
    private String name;
    private String position;
}