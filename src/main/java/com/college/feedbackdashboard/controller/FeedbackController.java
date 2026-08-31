package com.college.feedbackdashboard.controller;

import com.college.feedbackdashboard.model.Feedback;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {

    private final List<Feedback> feedbackList = new ArrayList<>();

    @PostMapping
    public Feedback addFeedback(@RequestBody Feedback feedback) {
        feedbackList.add(feedback);
        return feedback;
    }

    @GetMapping
    public List<Feedback> getFeedback() {
        return feedbackList;
    }
}