package com.demo.taskmanager.controllers;

import com.demo.taskmanager.entities.TaskEntity;
import com.demo.taskmanager.model.CreateTaskModel;
import com.demo.taskmanager.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("")
    public ResponseEntity<List<TaskEntity>> getTasks() {
        List<TaskEntity> tasks = taskService.getAllTasks();
        return ResponseEntity.ok(tasks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskEntity> getTaskById(@PathVariable int id) {
        TaskEntity task = taskService.getTaskById(id);
        if (task == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(task);
    }

    @PostMapping("")
    public ResponseEntity<TaskEntity> createTask(@RequestBody CreateTaskModel createTaskModel) {
        TaskEntity task = taskService.addTask(createTaskModel.getTitle(), createTaskModel.getDescription(), createTaskModel.getDeadline());
        return ResponseEntity.ok(task);
    }

}
