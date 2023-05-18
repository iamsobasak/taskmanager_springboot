package com.demo.taskmanager.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CreateTaskModel {
    private String title;
    private String description;
    private String deadline;
}
