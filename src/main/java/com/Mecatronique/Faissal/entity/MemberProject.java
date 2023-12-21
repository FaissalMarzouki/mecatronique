package com.Mecatronique.Faissal.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
import java.util.Date;

@Document(collection = "member_projects")
public class MemberProject {
    @Id
    private String memberProjectID;

    @DBRef
    private Member member;

    @DBRef
    private Project project;

    private String contribution;
    private Date joinDate;
    public MemberProject() {
    }
    public MemberProject(String memberProjectID, Member member, Project project, String contribution, Date joinDate) {
        this.memberProjectID = memberProjectID;
        this.member = member;
        this.project = project;
        this.contribution = contribution;
        this.joinDate = joinDate;
    }
    public String getMemberProjectID() {
        return memberProjectID;
    }
    public void setMemberProjectID(String memberProjectID) {
        this.memberProjectID = memberProjectID;
    }
    public Member getMember() {
        return member;
    }
    public void setMember(Member member) {
        this.member = member;
    }
    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }
    public String getContribution() {
        return contribution;
    }
    public void setContribution(String contribution) {
        this.contribution = contribution;
    }
    public Date getJoinDate() {
        return joinDate;
    }
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
    @Override
    public String toString() {
        return "MemberProject [memberProjectID=" + memberProjectID + ", member=" + member + ", project=" + project
                + ", contribution=" + contribution + ", joinDate=" + joinDate + "]";
    }
    

}

