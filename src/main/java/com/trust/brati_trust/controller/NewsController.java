package com.trust.brati_trust.controller;

import com.trust.brati_trust.entity.News;
import com.trust.brati_trust.service.NewsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/news")
@CrossOrigin(origins = "http://localhost:3000")
public class NewsController {
    private final NewsService service;

    public NewsController(NewsService service) {
        this.service = service;
    }

    @PostMapping
    public News addNews(@RequestBody News news) {
        return service.saveNews(news);
    }

    @GetMapping
    public Page<News> getAllNews(Pageable pageable) {
        return service.getAllNews(pageable);
    }
}
