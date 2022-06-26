package com.example.diningReview.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String city;
    private String state;
    private String zipcode;
    private boolean peanut;
    private boolean egg;
    private boolean dairy;
}
