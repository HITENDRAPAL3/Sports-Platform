package com.football.football.PersistenceLayer.jpa;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "matchDetails")
public class MatchScoreDetailsJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "match_id")
    private Long matchId;

    @Column(name = "home_team_name")
    private String homeTeamName;

    @Column(name = "home_team_score")
    private Integer homeTeamScore;

    @Column(name = "away_team_name")
    private String awayTeamName;

    @Column(name = "away_team_score")
    private Integer awayTeamScore;
}