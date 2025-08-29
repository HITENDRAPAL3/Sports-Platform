package com.football.football.DomainLayer.DTO.MatchScoreDetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MatchScoreDetailsDTO {

    private Long matchId;
    private String homeTeamName;
    private Integer homeTeamScore;
    private String awayTeamName;
    private Integer awayTeamScore;
    private String matchStatus;
}
