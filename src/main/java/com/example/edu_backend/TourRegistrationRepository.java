
package com.example.edu_backend;

import com.example.edu_backend.TourRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRegistrationRepository
        extends JpaRepository<TourRegistration, Long> {
}