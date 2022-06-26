package com.example.diningReview.repositories;

import com.example.diningReview.model.DiningReview;
import com.example.diningReview.model.ReviewStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DiningReviewRepository extends CrudRepository<DiningReview, Long> {
    List<Review> findByStatus(ReviewStatus status);
    List<Review> findByRestaurantIdAndStatus(Long id, DiningReview status);

}