package com.in60minutes.springboot.controller;

import com.in60minutes.springboot.entity.Project;
import com.in60minutes.springboot.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/save")
    public Project saveDetailes(@RequestBody Project project){
        return projectService.saveData(project);
    }

    @GetMapping("/getAll")
    public List<Project> getAll(){
        return projectService.getAllList();
    }

    @GetMapping("/get/{id}")
    public Project getById(@PathVariable long id){
        return projectService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        projectService.deleteId(id);

    }

    @PutMapping("/update/{id}")
    public Project update(@PathVariable long id,
                          @RequestBody Project project){
        return projectService.updateOne(id,project);
    }
}
