package com.football.football.DomainLayer.DTO.MatchScoreDetails;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MatchScoreDetailsDTO {

    private TeamInfoDTO homeTeam;
    private TeamInfoDTO awayTeam;

    @Getter
    @Setter
    @ToString
    public static class TeamInfoDTO {
        private String name;
        private Integer score;
    }

}
