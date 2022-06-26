package com.example.diningReview.repositories;

import com.example.diningReview.model.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    List<Restaurant> FindByZipcodeDesc(String zipcode);
}