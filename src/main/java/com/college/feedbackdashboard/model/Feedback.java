package com.college.feedbackdashboard.model;

public class Feedback {

    private String contentTitle;
    private int rating;
    private String feedback;
    private String severity;

    public Feedback() {
    }

    public Feedback(String contentTitle, int rating,
                    String feedback, String severity) {
        this.contentTitle = contentTitle;
        this.rating = rating;
        this.feedback = feedback;
        this.severity = severity;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}