package com.Mecatronique.Faissal.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Competitions")
public class Competition {
    @Id
	private String idCompetition;
	private int title;
	private int description;
	private String cover_image;
	private Date date;
	private Date time_stamp;
	private Date last_modified;
    public Competition() {
    }
    public Competition(String idCompetition, int title, int description, String cover_image, Date date, Date time_stamp,
            Date last_modified) {
        this.idCompetition = idCompetition;
        this.title = title;
        this.description = description;
        this.cover_image = cover_image;
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
    public int getTitle() {
        return title;
    }
    public void setTitle(int title) {
        this.title = title;
    }
    public int getDescription() {
        return description;
    }
    public void setDescription(int description) {
        this.description = description;
    }
    public String getCover_image() {
        return cover_image;
    }
    public void setCover_image(String cover_image) {
        this.cover_image = cover_image;
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
                + ", cover_image=" + cover_image + ", date=" + date + ", time_stamp=" + time_stamp + ", last_modified="
                + last_modified + "]";
    }
    


}
