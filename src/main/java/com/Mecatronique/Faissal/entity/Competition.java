package com.Mecatronique.Faissal.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Competitions")
public class Competition {
    @Id
	private String idCompetition;
	private String title;
	private String description;
	private List<Image> image;
	private Date date;
	private Date time_stamp;
	private Date last_modified;
    public Competition() {
    }
    public Competition(String idCompetition, String title, String description, List<Image> image, Date date, Date time_stamp,
            Date last_modified) {
        this.idCompetition = idCompetition;
        this.title = title;
        this.description = description;
        this.image = image;
        this.date = date;
        this.time_stamp = time_stamp;
        this.last_modified = last_modified;
    }
    public String getIdCompetition() {
        return idCompetition;
    }
    public void setIdCompetition(String idCompetition) {
        this.idCompetition = idCompetition;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Image> getImage() {
        return image;
    }
    public void setImage(List<Image> image) {
        this.image = image;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getTime_stamp() {
        return time_stamp;
    }
    public void setTime_stamp(Date time_stamp) {
        this.time_stamp = time_stamp;
    }
    public Date getLast_modified() {
        return last_modified;
    }
    public void setLast_modified(Date last_modified) {
        this.last_modified = last_modified;
    }
    @Override
    public String toString() {
        return "Competition [idCompetition=" + idCompetition + ", title=" + title + ", description=" + description
                + ", image=" + image + ", date=" + date + ", time_stamp=" + time_stamp + ", last_modified="
                + last_modified + "]";
    }
    


}
