package com.Mecatronique.Faissal.entity;

import java.util.Date;
import java.util.List;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
@Data
@Document(collection = "Competitions")
public class Competition {
    @Id
	private String idCompetition;
	private String title;
	private String description;
    private List<Member> members;
	private List<Image> image;
	private Date date;
	private Date time_stamp;
	private Date last_modified;

}
