package com.football.football.PersistenceLayer;

import com.football.football.PersistenceLayer.jpa.MatchScoreDetailsJPA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FootballRepo extends JpaRepository<MatchScoreDetailsJPA, Long> {
}