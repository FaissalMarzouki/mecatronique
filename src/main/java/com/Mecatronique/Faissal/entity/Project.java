package com.Mecatronique.Faissal.entity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
@Data
@Document(collection = "projects")
public class Project {
    @Id    
    private String projectID;
    private String projectName;
    private String category;
    private String description;
    private String completion;
    private Date startDate;
    private Date endDate;
    private List<Image> image;
    private List<Member> members;
    private Date time_stamp;
	private Date modified;
}

