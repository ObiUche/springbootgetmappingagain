package com.example.task.entity;

public class Task {
    private int id;
    private String name;
    private String description;
    private boolean completed;

    public Task(){}

    public Task(int id, String name, boolean completed, String description) {
        this.id = id;
        this.name = name;
        this.completed = completed;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
