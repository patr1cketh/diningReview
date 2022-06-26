package com.example.diningReview.repositories;

import com.example.diningReview.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List
}