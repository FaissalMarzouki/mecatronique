package com.Mecatronique.Faissal.entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "members")
public class Member{
    @Id
    private String memberID;
    private String memberName;
    private String sector;

    private Date joinDate;


}
