package com.in60minutes.springboot.service;

import com.in60minutes.springboot.entity.Project;
import com.in60minutes.springboot.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectRepository projectRepository;
    @Override
    public Project saveData(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> getAllList() {
        return projectRepository.findAll();
    }

    @Override
    public Project getById(long id) {
        return projectRepository.findById(id).get();
    }

    @Override
    public Project updateOne(long id, Project project) {
        Optional<Project> e = projectRepository.findById(id);
        if(e.isPresent()) {
            Project pro = e.get();
//            pro.setId(project.getId());
            pro.setName(project.getName());
            pro.setAge(project.getAge());
            pro.setEmail(project.getEmail());
            return projectRepository.save(pro);
        }else {
            return null;
        }

//        project.setId(id);
//        return projectRepository.save(project);
    }

    @Override
    public void deleteId(Long id) {
        projectRepository.deleteById(id);
    }
}
