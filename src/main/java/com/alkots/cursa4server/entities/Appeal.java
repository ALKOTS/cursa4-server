package com.alkots.cursa4server.entities;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Appeal {
    @Id
    @GeneratedValue
    private Long id;

    private String team;
    private String question;
    private String answer;
    private String rAnswer;
}
