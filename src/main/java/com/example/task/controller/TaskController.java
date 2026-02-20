package com.example.task.controller;

import com.example.task.entity.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    private final List<Task> taskList = List.of(
            new Task(1, "Task1", false, "A first test task"),
            new Task(2, "Task2", false, "A first test task")
    );

    @GetMapping("/tasks")
    public List<Task> getTasks(){
        return taskList;
    }
}
