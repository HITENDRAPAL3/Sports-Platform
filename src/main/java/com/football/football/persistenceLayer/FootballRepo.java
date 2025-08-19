package com.football.football.persistenceLayer;

import com.football.football.persistenceLayer.jpa.MatchJPA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FootballRepo extends JpaRepository<MatchJPA, Long> {
}