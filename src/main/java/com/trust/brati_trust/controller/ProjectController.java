package com.trust.brati_trust.controller;

import com.trust.brati_trust.entity.Project;
import com.trust.brati_trust.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectController {

    private final ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @PostMapping
    public Project addProject(@RequestBody Project project) {
        return service.saveProject(project);
    }

    @GetMapping
    public List<Project> getAllProjects() {
        return service.getAllProjects();
    }

}
