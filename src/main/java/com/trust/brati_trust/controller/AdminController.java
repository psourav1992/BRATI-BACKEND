package com.trust.brati_trust.controller;

import com.trust.brati_trust.entity.BratiVolunteer;
import com.trust.brati_trust.entity.News;
import com.trust.brati_trust.entity.Volunteer;
import com.trust.brati_trust.service.BratiVolunteerService;
import com.trust.brati_trust.service.NewsService;
import com.trust.brati_trust.service.VolunteerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "${cors.allowed-origins}")
public class AdminController {

    private final NewsService newsService;
    private final VolunteerService service;
    private final BratiVolunteerService bratiVolunteerService;
    public AdminController(VolunteerService service, NewsService newsService,BratiVolunteerService bratiVolunteerService) {
        this.service = service;
        this.newsService = newsService;
        this.bratiVolunteerService = bratiVolunteerService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BratiVolunteer addBratiVolunteer(@RequestBody BratiVolunteer bratiVolunteer) {
        return bratiVolunteerService.saveBratiVolunteer(bratiVolunteer);
    }

    /*@GetMapping
    public List<News> getAllNews() {
        return newsService.getAllNews();
    }*/


}
