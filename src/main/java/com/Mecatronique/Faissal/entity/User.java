package com.Mecatronique.Faissal.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "users")
public class User {
    @Id
    private String userId;
    private String firstName;
    private String email;
    private String userName;
    private String password;
    private String lastName;
    private String phone;
    private String address;
    public User() {
    }
    public User(String userId, String firstName, String email, String userName, String password, String lastName, String phone, String address) {
        this.userId = userId;
        this.firstName = firstName;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "User [userId=" + userId + ", firstName=" + firstName + ", email=" + email + ", userName=" + userName
                + ", password=" + password + ", lastName=" + lastName + ", phone=" + phone + ", address=" + address
                + "]";
    }
    
}
