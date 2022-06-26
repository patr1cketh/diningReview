package com.example.diningReview.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.*;


@Entity
@RequiredArgsConstructor
@Setter
@Getter
public class DiningReview {

    @Id
    @GeneratedValue
    private Long id;
    private String displayName;
    private Long restaurantId;
    private float peanutScore;
    private float eggScore;
    private float dairyScore;
    private String commentary;
    private ReviewStatus status;

}
