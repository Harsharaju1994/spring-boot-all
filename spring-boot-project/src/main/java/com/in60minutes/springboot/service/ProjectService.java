package com.in60minutes.springboot.service;


import com.in60minutes.springboot.entity.Project;

import java.util.List;

public interface ProjectService {
    Project saveData(Project project);

    List<Project> getAllList();

    Project getById(long id);



    Project updateOne(long id, Project project);

    void deleteId(Long id);
}
