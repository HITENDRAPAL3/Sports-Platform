package com.football.football.ControllerLayer.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MatchEvent {

    @JsonProperty("matchId")
    private String matchId;

    @JsonProperty("eventId")
    private String eventId;

    @JsonProperty("timestamp")
    private String timestamp;

    @JsonProperty("minute")
    private Integer minute;

    @JsonProperty("eventType")
    private String eventType;

    @JsonProperty("team")
    private String team;

    @JsonProperty("player")
    private String player;

    @JsonProperty("description")
    private String description;

    @JsonProperty("additionalInfo")
    private String additionalInfo;

}
