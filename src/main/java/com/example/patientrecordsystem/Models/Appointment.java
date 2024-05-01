package com.example.patientrecordsystem.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate appointmentDate;
    private String doctorName;
    private String purposeOfVisit;
    @ManyToOne
    private Patient patient;
}
