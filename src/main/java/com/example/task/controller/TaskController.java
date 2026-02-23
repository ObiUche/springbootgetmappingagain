package com.example.task.controller;

import com.example.task.entity.Task;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    private final List<Task> taskList = List.of(
            new Task(1, "Task1", false, "A first test task"),
            new Task(2, "Task2", false, "A Second test task")
    );

    private final List<Task> taskList2 = List.of(
            new Task(4, "Task 4", false, "Hello Worldddd"),
            new Task(5, "Task 5", false, "Hello Darkness my Old Friend")
    );


    // Return all tasks
    @GetMapping("/tasks")
    public List<Task> getTasks(){
        return taskList;
    }

    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable int id){
        return taskList.get(id - 1);
    }

    // Customizing getMapping returns

    @GetMapping("tasks2/{id}")
    public ResponseEntity<Task> getResponseEntity(@PathVariable int id){
        return new ResponseEntity<>(taskList2.get(id -1), HttpStatus.ACCEPTED); // 202
    }
}
