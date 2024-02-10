package com.Mecatronique.Faissal.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "images")
public class Image {
        @Id
    private String IdImage;
	private String link;
	private Date time_stamp;
    
    public Image() {
    }
    
    public Image(String IdImage, String link, Date time_stamp) {
        this.IdImage = IdImage;
        this.link = link;
        this.time_stamp = time_stamp;
    }
    
    public String getIdImage() {
        return IdImage;
    }
    
    public void setIdImage(String IdImage) {
        this.IdImage = IdImage;
    }
    
    public String getLink() {
        return link;
    }
    
    public void setLink(String link) {
        this.link = link;
    }
    
    public Date getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(Date time_stamp) {
        this.time_stamp = time_stamp;
    }
    
    @Override
    public String toString() {
        return "Image [IdImage=" + IdImage + ", link=" + link + ", time_stamp=" + time_stamp + "]";
    }
    
}
