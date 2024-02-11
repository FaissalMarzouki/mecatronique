package com.Mecatronique.Faissal.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
import java.util.Date;

@Document(collection = "member_events")
public class MemberEvent {
    @Id
    private String memberEventID;
    private Member member;
    private Event event;

    private String attendanceStatus;
    private Date registrationDate;
    public MemberEvent() {
    }
    public MemberEvent(String memberEventID, Member member, Event event, String attendanceStatus,
            Date registrationDate) {
        this.memberEventID = memberEventID;
        this.member = member;
        this.event = event;
        this.attendanceStatus = attendanceStatus;
        this.registrationDate = registrationDate;
    }
    public String getMemberEventID() {
        return memberEventID;
    }
    public void setMemberEventID(String memberEventID) {
        this.memberEventID = memberEventID;
    }
    public Member getMember() {
        return member;
    }
    public void setMember(Member member) {
        this.member = member;
    }
    public Event getEvent() {
        return event;
    }
    public void setEvent(Event event) {
        this.event = event;
    }
    public String getAttendanceStatus() {
        return attendanceStatus;
    }
    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }
    public Date getRegistrationDate() {
        return registrationDate;
    }
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
    @Override
    public String toString() {
        return "MemberEvent [memberEventID=" + memberEventID + ", member=" + member + ", event=" + event
                + ", attendanceStatus=" + attendanceStatus + ", registrationDate=" + registrationDate + "]";
    }

}

