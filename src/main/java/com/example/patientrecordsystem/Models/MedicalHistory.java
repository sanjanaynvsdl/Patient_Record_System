package com.example.patientrecordsystem.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.example.patientrecordsystem.Models.Patient;
import java.time.*;
@Getter
@Setter
@Entity
public class MedicalHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Patient patient;
    private String diseaseName;
    private String treatmentDetails;
    private LocalDate dateOfDiagnosis;
}
