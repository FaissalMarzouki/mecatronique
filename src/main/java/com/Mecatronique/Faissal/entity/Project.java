package com.Mecatronique.Faissal.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Document(collation = "projects")
public class Project {
    @Id    
    private String projectID;
    private String projectName;
    private String category;
    private String description;
    private String completion;
    private Date startDate;
    private Date endDate;
     @DBRef
    private Image image;
    private Date time_stamp;
	private Date modified;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Project() {
    }

   

    public Project(String projectID, String projectName, String category, String description, String completion,
            Date startDate, Date endDate, Image image, Date time_stamp, Date modified) {
        this.projectID = projectID;
        this.projectName = projectName;
        this.category = category;
        this.description = description;
        this.completion = completion;
        this.startDate = startDate;
        this.endDate = endDate;
        this.image = image;
        this.time_stamp = time_stamp;
        this.modified = modified;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }



    public String getCompletion() {
        return completion;
    }

    public void setCompletion(String completion) {
        this.completion = completion;
    }

    public Image getImage() {
        return image;
    }
    public void setImage(Image image) {
        this.image = image;
    }
    public Date getTime_stamp() {
        return time_stamp;
    }
    public void setTime_stamp(Date time_stamp) {
        this.time_stamp = time_stamp;
    }
    public Date getModified() {
        return modified;
    }
    public void setModified(Date modified) {
        this.modified = modified;
    }



    @Override
    public String toString() {
        return "Project [projectID=" + projectID + ", projectName=" + projectName + ", category=" + category
                + ", description=" + description + ", completion=" + completion + ", startDate=" + startDate
                + ", endDate=" + endDate + ", image=" + image + ", time_stamp=" + time_stamp + ", modified="
                + modified + "]";
    }

   
        
}

