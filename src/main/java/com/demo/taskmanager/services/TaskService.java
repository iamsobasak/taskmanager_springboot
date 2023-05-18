package com.demo.taskmanager.services;

import com.demo.taskmanager.entities.TaskEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@Service
public class TaskService {
    private ArrayList<TaskEntity> tasks = new ArrayList<>();
    private int id = 1;

    public TaskEntity addTask(String title, String description, String deadline) {
        TaskEntity task = new TaskEntity();
        task.setId(id);
        task.setTitle(title);
        task.setDescription(description);
        task.setDeadline(LocalDate.parse(deadline, DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // validate the format of the date before formatting
        task.setCompleted(false);
        tasks.add(task);
        id++;
        return task;
    }

    public ArrayList<TaskEntity> getAllTasks() {
        return tasks;
    }

    public TaskEntity getTaskById(int id) {
        for (TaskEntity task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }


}
