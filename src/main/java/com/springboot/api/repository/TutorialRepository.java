package com.springboot.api.repository;


import com.springboot.api.model.ModelTuto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TutorialRepository extends MongoRepository<ModelTuto, String> {
    List<ModelTuto> findByTitleContaining(String title);
}
