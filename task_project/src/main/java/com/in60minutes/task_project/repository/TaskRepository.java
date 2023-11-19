package com.in60minutes.task_project.repository;

import com.in60minutes.task_project.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
