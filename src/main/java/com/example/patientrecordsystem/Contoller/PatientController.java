package com.example.patientrecordsystem.Contoller;


import com.example.patientrecordsystem.Models.Appointment;
import com.example.patientrecordsystem.Models.MedicalHistory;
import com.example.patientrecordsystem.Models.Patient;
import com.example.patientrecordsystem.Service.PatientServiceInterface;
import java.util.Optional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/patients")
public class PatientController {
    private final PatientServiceInterface patientServiceInterface;
    public PatientController(PatientServiceInterface patientServiceInterface) {
        this.patientServiceInterface = patientServiceInterface;
    }
    @GetMapping
    public List<Patient> getAllPatients() {
        return patientServiceInterface.getAllPatients();
    }
    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable("id") Long id) {
        return patientServiceInterface.getPatientById(id);
    }
    @PutMapping()
    public Patient addPatient(@RequestBody Patient patient) {
        return patientServiceInterface.addPatient(patient);
    }
    @DeleteMapping("/{id}")
    public  void deletePatient(@PathVariable("id") Long id) {
         patientServiceInterface.deletePatient(id);
    }
}
