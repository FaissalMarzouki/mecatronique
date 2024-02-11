package com.Mecatronique.Faissal.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Products")
public class Product {
    @Id
    private String idProduct;
	private String name;
	private int price;
	private Date year;
    private List<Image> image;
	private String description;
    public Product() {
    }
    public Product(String idProduct, String name, int price, Date year, String description,List<Image> image) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.year = year;
        this.description = description;
        this.image = image;
    }
    public String getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Date getYear() {
        return year;
    }
    public void setYear(Date year) {
        this.year = year;
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
    @Override
    public String toString() {
        return "Product [idProduct=" + idProduct + ", name=" + name + ", price=" + price + ", year=" + year + ", image="
                + image + ", description=" + description + "]";
    }
    


}
