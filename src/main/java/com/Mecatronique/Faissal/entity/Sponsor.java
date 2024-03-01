package com.Mecatronique.Faissal.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data

@Document(collection = "sponsors")
public class Sponsor {
    @Id
    private String idSponsor;
    private String name;
    private String description;

}
