package com.football.football.PersistenceLayer;

import com.football.football.PersistenceLayer.jpa.MatchJPA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FootballRepo extends JpaRepository<MatchJPA, Long> {
}