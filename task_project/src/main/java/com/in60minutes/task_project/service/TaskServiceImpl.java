package com.in60minutes.task_project.service;

import com.in60minutes.task_project.dto.TaskDto;
import com.in60minutes.task_project.entity.Task;
import com.in60minutes.task_project.entity.User;
import com.in60minutes.task_project.exception.ResourceNotFoundException;
import com.in60minutes.task_project.repository.TaskRepository;
import com.in60minutes.task_project.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public TaskDto saveTask(long userid, TaskDto taskDto) {
        User user = userRepository.findById(userid)
                .orElseThrow(()->new ResourceNotFoundException(String.format("user id %d not found",userid)));
        Task task = modelMapper.map(taskDto,Task.class);
        task.setUsers(user);
        Task savedTask = taskRepository.save(task);
        return modelMapper.map(savedTask,TaskDto.class);
    }

    @Override
    public List<TaskDto> getAllTasks(long userid) {
        return null;
    }
}
