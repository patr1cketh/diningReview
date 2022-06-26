package com.example.diningReview.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonTypeId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.*;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private float peanutScore;
    private float eggScore;
    private float dairyScore;
    private float overallScore;
}
