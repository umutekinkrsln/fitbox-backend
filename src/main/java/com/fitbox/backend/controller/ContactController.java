package com.fitbox.backend.controller;

import com.fitbox.backend.model.Contact;
import com.fitbox.backend.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*") // frontend ile bağlantı için
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping
    public Contact createContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }
}
