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
    private Team team;

    @JsonProperty("player")
    private Player player;

    @JsonProperty("description")
    private String description;

    @JsonProperty("additionalInfo")
    private AdditionalInfo additionalInfo;

    @Getter
    @Setter
    @ToString
    public static class Team {

        @JsonProperty("id")
        private String id;

        @JsonProperty("name")
        private String name;
    }

    @Getter
    @Setter
    @ToString
    public static class Player {

        @JsonProperty("id")
        private String id;

        @JsonProperty("name")
        private String name;

        @JsonProperty("position")
        private String position;
    }

    @Getter
    @Setter
    @ToString
    public static class AdditionalInfo {

        @JsonProperty("substitutionFor")
        private String substitutionFor;

        @JsonProperty("substitutionType")
        private String substitutionType;
    }
}
