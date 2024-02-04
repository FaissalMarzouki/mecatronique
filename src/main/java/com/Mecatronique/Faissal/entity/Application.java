package com.Mecatronique.Faissal.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Applications")
public class Application {
    @Id
	private String idApplication;
	private String full_name;
	private String phone;
	private Date time_stamp;
	private String role;
	private String motivation;

	public Application() {

	}

    public Application(String idApplication, String full_name, String phone, Date time_stamp, String role, String motivation) {
        this.idApplication = idApplication;
        this.full_name = full_name;
        this.phone = phone;
        this.time_stamp = time_stamp;
        this.role = role;
        this.motivation = motivation;
    }

    public String getIdApplication() {
        return idApplication;
    }

    public void setIdApplication(String idApplication) {
        this.idApplication = idApplication;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(Date time_stamp) {
        this.time_stamp = time_stamp;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    @Override
    public String toString() {
        return "Application [idApplication=" + idApplication + ", full_name=" + full_name + ", phone=" + phone + ", time_stamp=" + time_stamp
                + ", role=" + role + ", motivation=" + motivation + "]";
    }



}
