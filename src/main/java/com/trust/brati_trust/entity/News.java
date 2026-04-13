package com.trust.brati_trust.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String headline;
    private String content;
    private String imageUrl;
    private LocalDateTime publishedAt = LocalDateTime.now();
    private Date eventDate;

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalDateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(LocalDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", headline='" + headline + '\'' +
                ", content='" + content + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", publishedAt=" + publishedAt +
                '}';
    }
}
