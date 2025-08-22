package com.football.football.ControllerLayer.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MatchComment {

    @JsonProperty("commentId")
    private String commentId;

    @JsonProperty("matchId")
    private String matchId;
    
    @JsonProperty("userId")
    private String userId;
    
    @JsonProperty("userName")
    private String userName;
    
    @JsonProperty("text")
    private String text;
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    @JsonProperty("rating")
    private Integer rating;

}
