package com.trust.brati_trust.service;

import com.trust.brati_trust.entity.Contact;
import com.trust.brati_trust.entity.News;
import com.trust.brati_trust.repository.ContactRepository;
import com.trust.brati_trust.repository.NewsRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    private final ContactRepository repo;

    public ContactService(ContactRepository repo) {
        this.repo = repo;
    }

    public Contact saveContact(Contact v) {
        return repo.save(v);
    }

    public Page<Contact> getAllContacts(Pageable pageable) {
        return repo.findAll(pageable);
    }
}
