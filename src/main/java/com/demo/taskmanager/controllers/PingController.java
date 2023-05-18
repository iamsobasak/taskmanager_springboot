package com.demo.taskmanager.controllers;

import com.demo.taskmanager.entities.TaskEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ping")
public class PingController {

    @GetMapping("")
    public String ping() {
        return "pong";
    }

}
