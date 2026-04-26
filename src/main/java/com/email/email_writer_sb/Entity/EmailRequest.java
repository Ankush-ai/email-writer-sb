package com.email.email_writer_sb.Entity;

import lombok.*;


public class EmailRequest {
    private String emailContent;
    private String tone;

    public EmailRequest(String tone, String emailContent) {
        this.tone = tone;
        this.emailContent = emailContent;
    }

    public String getEmailContent() {
        return emailContent;
    }

    public String getTone() {
        return tone;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public EmailRequest() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
