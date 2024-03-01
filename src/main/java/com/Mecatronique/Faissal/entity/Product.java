package com.Mecatronique.Faissal.entity;

import java.util.Date;
import java.util.List;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data

@Document(collection = "Products")
public class Product {
    @Id
    private String idProduct;
	private String name;
	private int price;
	private Date year;
    private List<Image> image;
	private String description;

}
