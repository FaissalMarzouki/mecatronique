package com.Mecatronique.Faissal.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Data
@Document(collection = "events")
public class Event {
    @Id
    //les proprietes members
    private String eventID;
    private String eventName;
    private String description;
    private Date date;
    private String location;
    private Date time_stamp;
    private List<Image> image;
    private Sponsor sponsor;

}

