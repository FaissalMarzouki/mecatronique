package com.Mecatronique.Faissal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Mecatronique.Faissal.entity.Project;
import com.Mecatronique.Faissal.repository.ProjectRepository;


@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @PostMapping("/createProject")
    public ResponseEntity<Project> createProject(@RequestBody Project project) {
        Project createdProject = projectRepository.save(project);
        return new ResponseEntity<>(createdProject, HttpStatus.CREATED);
    }
}

