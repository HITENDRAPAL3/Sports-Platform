package com.football.football.ControllerLayer.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MatchScoreDetails {

    @JsonProperty("matchId")
    private Long matchId;

    @JsonProperty("homeTeamName")
    private String homeTeamName;

    @JsonProperty("homeTeamScore")
    private Integer homeTeamScore;

    @JsonProperty("awayTeamName")
    private String awayTeamName;

    @JsonProperty("awayTeamScore")
    private Integer awayTeamScore;
}
