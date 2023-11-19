package com.in60minutes.task_project.service;

import com.in60minutes.task_project.dto.TaskDto;

import java.util.List;

public interface TaskService {
    public TaskDto saveTask(long userid, TaskDto taskDto);
    public List<TaskDto> getAllTasks(long userid);
}
