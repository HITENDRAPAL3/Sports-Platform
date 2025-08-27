package com.football.football.PersistenceLayer.jpa;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "matchDetails")
public class MatchScoreDetailsJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "name", column = @Column(name = "home_team_name")),
            @AttributeOverride(name = "score", column = @Column(name = "home_team_score"))
    })
    private TeamInfoEmbeddable homeTeam;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "name", column = @Column(name = "away_team_name")),
            @AttributeOverride(name = "score", column = @Column(name = "away_team_score"))
    })
    private TeamInfoEmbeddable awayTeam;

    @Embeddable
    @Data
    public static class TeamInfoEmbeddable {
        private String name;
        private Integer score;
    }
}
