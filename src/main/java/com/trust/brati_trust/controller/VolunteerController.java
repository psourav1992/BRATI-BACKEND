package com.trust.brati_trust.controller;

import com.trust.brati_trust.entity.Volunteer;
import com.trust.brati_trust.service.VolunteerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/volunteers")
@CrossOrigin(origins = "http://localhost:3000")
public class VolunteerController {
    private final VolunteerService service;

    public VolunteerController(VolunteerService service) {
        this.service = service;
    }

    @PostMapping
    public Volunteer addVolunteer(@RequestBody Volunteer volunteer) {
        return service.saveVolunteer(volunteer);
    }

    @GetMapping
    public Page<Volunteer> getVolunteers(Pageable pageable) {
        return service.getAllVolunteers(pageable);
    }

}
