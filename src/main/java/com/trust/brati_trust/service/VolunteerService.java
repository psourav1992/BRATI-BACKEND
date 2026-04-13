package com.trust.brati_trust.service;

import com.trust.brati_trust.entity.Volunteer;
import com.trust.brati_trust.repository.VolunteerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerService {
    private final VolunteerRepository repo;

    public VolunteerService(VolunteerRepository repo) {
        this.repo = repo;
    }

    public Volunteer saveVolunteer(Volunteer v) {
        return repo.save(v);
    }

    public Page<Volunteer> getAllVolunteers(Pageable pageable) {
        return repo.findAll(pageable);
    }

}
