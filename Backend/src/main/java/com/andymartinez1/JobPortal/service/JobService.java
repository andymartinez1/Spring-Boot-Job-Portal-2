package com.andymartinez1.JobPortal.service;

import com.andymartinez1.JobPortal.model.JobPost;
import com.andymartinez1.JobPortal.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public void addJob(JobPost jobPost) {
        jobRepository.addJobPost(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return jobRepository.getAllJobPosts();
    }

}
