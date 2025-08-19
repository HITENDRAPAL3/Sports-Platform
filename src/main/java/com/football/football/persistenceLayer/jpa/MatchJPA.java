package com.football.football.persistenceLayer.jpa;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "table_1")
public class MatchJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matchName;
}
