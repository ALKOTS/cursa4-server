package com.alkots.cursa4server.repositories;

import com.alkots.cursa4server.entities.Appeal;
import com.alkots.cursa4server.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findById(long id);
}
