package com.capturer.backend.controller;

import com.capturer.backend.model.Contact;
import com.capturer.backend.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @CrossOrigin(origins = "*") // Allow frontend to access backend
    @PostMapping("/contact")
    public ResponseEntity<String> handleContactForm(@RequestBody Contact request) {
        contactRepository.save(request);
        return ResponseEntity.ok("Message saved and received successfully!");
    }

    @CrossOrigin(origins = "*") // Also needed here if frontend will call this
    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}
