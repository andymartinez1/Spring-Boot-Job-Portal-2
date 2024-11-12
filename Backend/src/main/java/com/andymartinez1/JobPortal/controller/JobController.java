package com.andymartinez1.JobPortal.controller;

import com.andymartinez1.JobPortal.model.JobPost;
import com.andymartinez1.JobPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/jobPosts")
    public List<JobPost> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/jobPost/{jobID}")
    public JobPost getJob(@PathVariable("jobID") int jobID) {
        return jobService.getJob(jobID);
    }

    @PostMapping("/jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        jobService.addJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @PutMapping("/jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        jobService.updateJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @DeleteMapping("/jobPost/{postID}")
    public String deleteJob(@PathVariable int postID) {
        jobService.deleteJob(postID);
        return "Deleted Successfully";
    }

}
