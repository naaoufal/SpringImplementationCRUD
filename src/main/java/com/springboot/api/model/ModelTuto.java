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

    public ModelTuto(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    // Getters :

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    // Setters :


    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Tutorial Work !!!";
    }
}
