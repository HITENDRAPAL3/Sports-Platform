package com.football.football.ControllerLayer.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MatchScoreDetails {

    @JsonProperty("homeTeam")
    private TeamInfo homeTeam;

    @JsonProperty("awayTeam")
    private TeamInfo awayTeam;

    @Getter
    @Setter
    @ToString
    public static class TeamInfo {

        @JsonProperty("name")
        private String name;

        @JsonProperty("score")
        private Integer score;

    }
}
