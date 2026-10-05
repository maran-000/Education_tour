package com.example.edu_backend;

import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "tour_registrration")
public class TourRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "register_number", nullable = false)
    private String registerNumber;

    @Column(nullable = false)
    private String email;

    private String department;

    @Column(name = "year")
    private String year;

    private String phone;

    public TourRegistration() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
 
    }
    private String destination;
    public void setDestination(String destination){
        this.destination=destination;
    }
    public String getDestination(){
        return destination;
    }
    private LocalDate date;
    public void setDate(LocalDate date){
        this.date=date;
    }
    public LocalDate getDate(){
        return date;
    }
}