package com.trust.brati_trust.controller;

import com.trust.brati_trust.entity.BratiVolunteer;
import com.trust.brati_trust.entity.Volunteer;
import com.trust.brati_trust.service.BratiVolunteerService;
import com.trust.brati_trust.service.VolunteerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bratiVolunteers")
@CrossOrigin(origins = "${cors.allowed-origins}")
public class BratiVolunteerController {
    private final BratiVolunteerService service;

    public BratiVolunteerController(BratiVolunteerService service) {
        this.service = service;
    }

    @PostMapping
    public BratiVolunteer addBratiVolunteer(@RequestBody BratiVolunteer volunteer) {
        return service.saveBratiVolunteer(volunteer);
    }

    @GetMapping
    public List<BratiVolunteer> getAllBratiVolunteers() {
        return service.getAllBratiVolunteers();
    }

}
