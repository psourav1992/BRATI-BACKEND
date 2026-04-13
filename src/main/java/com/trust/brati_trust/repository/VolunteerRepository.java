package com.trust.brati_trust.repository;

import com.trust.brati_trust.entity.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {}

