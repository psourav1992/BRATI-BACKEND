package com.trust.brati_trust.controller;

import com.trust.brati_trust.entity.Contact;
import com.trust.brati_trust.service.ContactService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
@CrossOrigin(origins = "${cors.allowed-origins}")
public class ContactController {
    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @PostMapping
    public Contact addContact(@RequestBody Contact contact) {
        return service.saveContact(contact);
    }

    @GetMapping
    public Page<Contact> getAllContacts(Pageable pageable) {
        return service.getAllContacts(pageable);
    }
}
