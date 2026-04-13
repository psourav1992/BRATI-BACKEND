package com.trust.brati_trust.service;

import com.trust.brati_trust.entity.Project;
import com.trust.brati_trust.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository repo;

    public ProjectService(ProjectRepository repo) {
        this.repo = repo;
    }

    public Project saveProject(Project v) {
        return repo.save(v);
    }

    public List<Project> getAllProjects() {
        return repo.findAll();
    }

}
