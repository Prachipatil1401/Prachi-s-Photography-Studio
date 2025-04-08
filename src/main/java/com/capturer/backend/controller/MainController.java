
package com.capturer.backend.controller;

import com.capturer.backend.model.Contact;
import com.capturer.backend.model.GalleryImage;
import com.capturer.backend.model.Testimonial;
import com.capturer.backend.repository.ContactRepository;
import com.capturer.backend.repository.GalleryImageRepository;
import com.capturer.backend.repository.TestimonialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class MainController {

    @Autowired
    private ContactRepository contactRepo;
    @Autowired
    private GalleryImageRepository galleryRepo;
    @Autowired
    private TestimonialRepository testimonialRepo;

    @GetMapping("/gallery")
    public List<GalleryImage> getGallery() {
        return galleryRepo.findAll();
    }

    @GetMapping("/testimonials")
    public List<Testimonial> getTestimonials() {
        return testimonialRepo.findAll();
    }
}
