package com.trust.brati_trust.service;

import com.trust.brati_trust.entity.BratiVolunteer;
import com.trust.brati_trust.entity.Volunteer;
import com.trust.brati_trust.repository.BratiVolunteerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BratiVolunteerService {
    private final BratiVolunteerRepository repo;

    public BratiVolunteerService(BratiVolunteerRepository repo) {
        this.repo = repo;
    }

    public BratiVolunteer saveBratiVolunteer(BratiVolunteer v) {
        return repo.save(v);
    }

    public List<BratiVolunteer> getAllBratiVolunteers() {
        return repo.findAll();
    }

}
