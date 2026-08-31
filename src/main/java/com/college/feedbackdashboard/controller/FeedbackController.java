package com.college.feedbackdashboard.controller;

import com.college.feedbackdashboard.model.Feedback;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {

    private final List<Feedback> feedbackList = new ArrayList<>();

    // Add feedback
    @PostMapping
    public Feedback addFeedback(@RequestBody Feedback feedback) {
        feedbackList.add(feedback);
        return feedback;
    }

    // Get all feedback
    @GetMapping
    public List<Feedback> getFeedback() {
        return feedbackList;
    }

    // Search feedback by content title
    @GetMapping("/search")
    public List<Feedback> searchFeedback(@RequestParam String keyword) {

        return feedbackList.stream()
                .filter(f -> f.getContentTitle()
                        .toLowerCase()
                        .contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Filter by severity
    @GetMapping("/severity/{severity}")
    public List<Feedback> filterBySeverity(
            @PathVariable String severity) {

        return feedbackList.stream()
                .filter(f -> f.getSeverity()
                        .equalsIgnoreCase(severity))
                .collect(Collectors.toList());
    }

    // Summary information
    @GetMapping("/summary")
    public String getSummary() {

        int total = feedbackList.size();

        double averageRating = feedbackList.stream()
                .mapToInt(Feedback::getRating)
                .average()
                .orElse(0);

        long highSeverity = feedbackList.stream()
                .filter(f -> f.getSeverity()
                        .equalsIgnoreCase("High"))
                .count();

        long lowRatings = feedbackList.stream()
                .filter(f -> f.getRating() <= 2)
                .count();

        return "{"
                + "\"totalFeedback\":" + total + ","
                + "\"averageRating\":" + String.format("%.2f", averageRating) + ","
                + "\"highSeverity\":" + highSeverity + ","
                + "\"lowRatings\":" + lowRatings
                + "}";
    }

    // Alerts / exceptions
    @GetMapping("/alerts")
    public List<Feedback> getAlerts() {

        return feedbackList.stream()
                .filter(f ->
                        f.getRating() <= 2 ||
                        f.getSeverity().equalsIgnoreCase("High"))
                .collect(Collectors.toList());
    }
}