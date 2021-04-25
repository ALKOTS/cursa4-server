package com.alkots.cursa4server.repositories;

import com.alkots.cursa4server.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long>{
    List<Team> findById(long id);
}
