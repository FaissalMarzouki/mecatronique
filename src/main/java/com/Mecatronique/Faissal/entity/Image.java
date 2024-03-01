package com.Mecatronique.Faissal.entity;

import java.util.Date;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data

@Document(collection = "images")
public class Image {
        @Id
    private String IdImage;
	private String link;
	private Date time_stamp;

}
