package com.football.football.DomainLayer.DTO.MatchDetailsDTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class LineupsDTO {
    private List<String> home;
    private List<String> away;
}