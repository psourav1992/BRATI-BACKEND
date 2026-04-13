package com.trust.brati_trust.service;

import com.trust.brati_trust.entity.News;
import com.trust.brati_trust.repository.NewsRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    private final NewsRepository repo;

    public NewsService(NewsRepository repo) {
        this.repo = repo;
    }

    public News saveNews(News v) {
        return repo.save(v);
    }

    public Page<News> getAllNews(Pageable pageable) {
        //return repo.findAll(Sort.by(Sort.Direction.ASC, "eventDate"));
        return repo.findAll(pageable);
    }
}
