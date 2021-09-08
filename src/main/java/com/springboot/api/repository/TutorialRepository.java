package com.springboot.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
    List<Tutorial> findByTitleContaining(String title);
}
