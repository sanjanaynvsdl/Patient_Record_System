package com.example.patientrecordsystem.Service;

import com.example.patientrecordsystem.CustomExceptions.PatientNotFound;
import com.example.patientrecordsystem.Models.Patient;
import com.example.patientrecordsystem.Repositeries.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService implements PatientServiceInterface {
    private final PatientRepository patientRepository;
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient getPatientById(Long id) {
        Optional<Patient> optionalPatient = patientRepository.findById(id);
        if(optionalPatient.isEmpty()) {
            throw new PatientNotFound("Patient not found with id: ");
        }
        return optionalPatient.orElse(null);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }


}
