package com.rokt.filedemo.entity;

import java.io.*;

/**
 * Chen Liu
 */
public class Rokt implements Serializable {
    private String eventTime;
    private String email;
    private String sessionId;

    public Rokt(){}

    public Rokt(String eventTime, String email, String sessionId) {
        this.eventTime = eventTime;
        this.email = email;
        this.sessionId = sessionId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

}
