package com.in60minutes.task_project.repository;

import com.in60minutes.task_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
