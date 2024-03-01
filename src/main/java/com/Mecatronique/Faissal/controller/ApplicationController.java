package com.Mecatronique.Faissal.controller;

import com.Mecatronique.Faissal.entity.Application;
import com.Mecatronique.Faissal.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/applications")
public class ApplicationController {

    @Autowired
    private ApplicationRepository applicationRepository;

    // Create
    @PostMapping("/createApplication")
    public Application createApplication(@RequestBody Application application) {
        return applicationRepository.save(application);
    }

    // Read all
    @GetMapping("/getAllApplications")
    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    // Read by id
    @GetMapping("/getApplicationById/{id}")
    public Optional<Application> getApplicationById(@PathVariable String id) {
        return applicationRepository.findById(id);
    }

    // Update
    @PutMapping("/updateApplication/{id}")
    public Application updateApplication(@PathVariable String id, @RequestBody Application updatedApplication) {
        updatedApplication.setIdApplication(id); // Ensure id consistency
        return applicationRepository.save(updatedApplication);
    }

    // Delete
    @DeleteMapping("/deleteApplication/{id}")
    public void deleteApplication(@PathVariable String id) {
        applicationRepository.deleteById(id);
    }
}
 
