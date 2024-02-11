package com.Mecatronique.Faissal.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.List;

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

    public Event() {
    }
    
    public Event(String eventID, String eventName, String description, Date date, String location, Date time_stamp,
             List<Image> image, Sponsor sponsor) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.description = description;
        this.date = date;
        this.location = location;
        this.time_stamp = time_stamp;
        this.image = image;
        this.sponsor = sponsor;
    }

    public String getEventID() {
        return eventID;
    }
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Date getTime_stamp() {
        return time_stamp;
    }
    public void setTime_stamp(Date time_stamp) {
        this.time_stamp = time_stamp;
    }
    public List<Image> getimage() {
        return image;
    }
    public void setimage(List<Image> image) {
        this.image = image;
    }
    public Sponsor getSponsor() {
        return sponsor;
    }
    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    @Override
    public String toString() {
        return "Event [eventID=" + eventID + ", eventName=" + eventName + ", description=" + description + ", date="
                + date + ", location=" + location + ", time_stamp=" + time_stamp + ", image=" + image + ", sponsor="
                + sponsor + "]";
    }


    
}

