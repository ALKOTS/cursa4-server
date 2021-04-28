package com.alkots.cursa4server.entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Team {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String accessKey;
    private Short state; //0- unqualified, 1- haven't played, 2-played

    @Nullable
    private Short score;

    private String email;
}
