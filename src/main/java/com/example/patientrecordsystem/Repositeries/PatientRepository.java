package com.example.patientrecordsystem.Repositeries;


import com.example.patientrecordsystem.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    @Override
    Optional<Patient> findById(Long id);
    @Override
    Patient save(Patient patient);
    List<Patient> findAll();
}
