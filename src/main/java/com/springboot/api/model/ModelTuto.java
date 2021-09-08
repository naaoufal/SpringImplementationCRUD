package com.springboot.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "test")
public class ModelTuto {
    @Id
    private String id;

    private String title;
    private String desc;

    public ModelTuto() {
        
    }

}
