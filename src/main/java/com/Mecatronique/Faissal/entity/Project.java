package com.Mecatronique.Faissal.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collation = "projects")
public class Project {
    @Id
    private String projectID;
    private String projectName;
    private String category;
    private String description;
    private String completion;
    private LocalDate startDate;
    private LocalDate endDate;
    
    public Project() {
    }

    public Project(String projectID, String projectName, String category, String description, String completion, LocalDate startDate, LocalDate endDate) {
        
        super();
        this.projectID = projectID;
        this.projectName = projectName;
        this.category = category;
        this.description = description;
        this.completion = completion;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getProjectID() {
        return projectID;
    }
    
    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }
    
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }



    public String getCompletion() {
        return completion;
    }

    public void setCompletion(String completion) {
        this.completion = completion;
    }

    @Override
    public String toString() {
        return "Project [projectID=" + projectID + ", projectName=" + projectName + ", category=" + category
                + ", description=" + description + ", completion=" + completion + ", startDate=" + startDate
                + ", endDate=" + endDate + "]";
    }
        
}

