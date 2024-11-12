package com.andymartinez1.JobPortal.repository;

import com.andymartinez1.JobPortal.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepository {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                    List.of("Python", "Machine Learning", "Data Analysis")),
            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
                    3, List.of("HTML", "CSS", "JavaScript", "React")),
            new JobPost(4, "Network Engineer",
                    "Design and implement computer networks for efficient data communication", 5,
                    List.of("Networking", "Cisco", "Routing", "Switching")),
            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
                    3, List.of("iOS Development", "Android Development", "Mobile App")),
            new JobPost(6, "DevOps Engineer", "Implement and manage continuous integration and delivery pipelines",
                    4, List.of("DevOps", "CI/CD", "Docker", "Kubernetes"))
    ));

    public List<JobPost> getAllJobPosts() {
        return jobs;
    }

    public void addJobPost(JobPost job) {
        jobs.add(job);
    }

    public JobPost getJob(int jobID) {
        for (JobPost job : jobs) {
            if (job.getPostId() == jobID) {
                return job;
            }
        }
        return null;
    }

    public void updateJob(JobPost jobPost) {
        for (JobPost jobPost1 : jobs) {
            if (jobPost1.getPostId() == jobPost.getPostId()) {
                jobPost1.setPostProfile(jobPost.getPostProfile());
                jobPost1.setPostDesc(jobPost.getPostDesc());
                jobPost1.setReqExperience(jobPost.getReqExperience());
                jobPost1.setPostTechStack(jobPost.getPostTechStack());
            }
        }
    }

    public void deleteJob(int postID) {
        for (JobPost jobPost : jobs) {
            if (jobPost.getPostId() == postID) {
                jobs.remove(jobPost);
            }
        }
    }
}
