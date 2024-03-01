package com.Mecatronique.Faissal.entity;

import java.util.Date;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Applications")
public class Application {
    @Id
	private String idApplication;
	private String full_name;
	private String phone;
	private Date time_stamp;
	private String role;
	private String motivation;

}
