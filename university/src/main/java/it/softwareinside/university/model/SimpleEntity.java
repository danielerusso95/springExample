package it.softwareinside.university.model;

import lombok.Data;

@Data
public class SimpleEntity {
    protected String name;

    public SimpleEntity(String name) {
        this.name = name;
    }
}   
    // no-arg constructor, getters, and setters
