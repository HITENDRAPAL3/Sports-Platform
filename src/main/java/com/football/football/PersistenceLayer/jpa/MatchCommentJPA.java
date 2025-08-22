package com.football.football.PersistenceLayer.jpa;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Field;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class MatchCommentJPA {

    @Id
    private String commentId;

    @Field("matchId")
    private String matchId;

    @Field("userId")
    private String userId;

    @Field("userName")
    private String userName;

    @Field("text")
    private String text;

    @Field("timestamp")
    private LocalDateTime timestamp;

    @Field("rating")
    private Integer rating;
}