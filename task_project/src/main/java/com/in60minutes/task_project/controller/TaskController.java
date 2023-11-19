package com.in60minutes.task_project.controller;

import com.in60minutes.task_project.dto.TaskDto;
import com.in60minutes.task_project.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/{userid}/tasks")
    public ResponseEntity<TaskDto> saveTask(
            @PathVariable("userid") long userid,
            @RequestBody TaskDto taskDto
    ){
        return new ResponseEntity<>(taskService.saveTask(userid,taskDto), HttpStatus.CREATED);
    }
}
