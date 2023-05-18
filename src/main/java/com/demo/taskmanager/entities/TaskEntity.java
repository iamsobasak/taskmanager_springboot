package com.demo.taskmanager.entities;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskEntity {

    private int id;
    private String title;
    private String description;
    private LocalDate deadline;
    private boolean completed;
}
