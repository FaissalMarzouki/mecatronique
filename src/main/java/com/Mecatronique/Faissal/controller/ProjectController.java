package com.Mecatronique.Faissal.controller;

import com.Mecatronique.Faissal.entity.Project;
import com.Mecatronique.Faissal.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    // Create
    @PostMapping("/createProject")
    public Project createProject(@RequestBody Project project) {
        return projectRepository.save(project);
    }

    // Read 
    @GetMapping("/getAllProjects")
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    // Read by id
    @GetMapping("/getProjectById/{id}")
    public Optional<Project> getProjectById(@PathVariable String id) {
        return projectRepository.findById(id);
    }

    // Update
    @PutMapping("/updateProject/{id}")
    public Project updateProject(@PathVariable String id, @RequestBody Project updatedProject) {
        updatedProject.setProjectID(id); // Ensure id consistency
        return projectRepository.save(updatedProject);
    }

    // Delete
    @DeleteMapping("/deleteProject/{id}")
    public void deleteProject(@PathVariable String id) {
        // Delete the project by ID
        projectRepository.deleteById(id);
    }
}


