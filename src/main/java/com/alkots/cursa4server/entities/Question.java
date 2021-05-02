package com.alkots.cursa4server.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue
    private Long id;

    private String question;
    private String answer;

}


//localhost:8080