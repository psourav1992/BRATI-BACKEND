package com.trust.brati_trust.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class BratiVolunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String role;
    private LocalDateTime createdAt = LocalDateTime.now();

    public BratiVolunteer() {
    }

    public BratiVolunteer(String fullName, String role) {
        this.fullName = fullName;
        this.role = role;
    }

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public BratiVolunteer(Long id, String fullName, String role, LocalDateTime createdAt) {
        this.id = id;
        this.fullName = fullName;
        this.role = role;
        this.createdAt = createdAt;
    }
}

