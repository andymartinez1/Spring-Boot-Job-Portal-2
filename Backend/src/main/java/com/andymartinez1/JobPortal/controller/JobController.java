package com.andymartinez1.JobPortal.controller;

import com.andymartinez1.JobPortal.model.JobPost;
import com.andymartinez1.JobPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/jobPosts")
    @ResponseBody
    public List<JobPost> getAllJobs(){
        return jobService.getAllJobs();
    }

}
