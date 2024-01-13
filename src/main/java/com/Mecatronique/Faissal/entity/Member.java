package com.Mecatronique.Faissal.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "members")
public class Member extends User{
    @Id
    //les proprietes members
    private String memberID;
    
    private String sector;

    private Date joinDate;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Member(String memberID, String sector, Date joinDate) {
        this.memberID = memberID;
        this.sector = sector;
        this.joinDate = joinDate;
    }

    public Member() {
    }

    @Override
    public String toString() {
        return "Member [memberID=" + memberID + ", sector=" + sector + ", joinDate=" + joinDate + "]";
    }

}
