package com.Mecatronique.Faissal.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sponsors")
public class Sponsor {
    @Id
    private String idSponsor;
    private String name;
    private String description;
    public String getId() {
        return idSponsor;
    }
    public void setId(String idSponsor) {
        this.idSponsor = idSponsor;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Sponsor(String idSponsor, String name, String description) {
        this.idSponsor = idSponsor;
        this.name = name;
        this.description = description;
    }
    public Sponsor() {
    }
    @Override
    public String toString() {
        return "Sponsor [idSponsor=" + idSponsor + ", name=" + name + ", description=" + description + "]";
    }
    
}
