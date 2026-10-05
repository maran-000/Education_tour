
package com.example.edu_backend;

import com.example.edu_backend.TourRegistration;
import com.example.edu_backend.TourRegistrationRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@RequestMapping("/api/tour-registrations")
@CrossOrigin(origins = "*")
public class TourRegistrationController {

    private final TourRegistrationRepository repository;

    public TourRegistrationController(
            TourRegistrationRepository repository) {
        this.repository = repository;
    }

    // Register a student
    @PostMapping
    public TourRegistration registerStudent(
            @RequestBody TourRegistration student) {
        return repository.save(student);
    }

    // View all registrations
    @GetMapping
    public List<TourRegistration> getAllRegistrations() {
        return repository.findAll();
    }

    // View one registration by ID
    @GetMapping("/{id}")
    public TourRegistration getRegistration(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Registration not found"));
    }
}