package com.example.patientrecordsystem.Service;

import com.example.patientrecordsystem.Models.Appointment;
import com.example.patientrecordsystem.Models.MedicalHistory;
import com.example.patientrecordsystem.Models.Patient;

import java.util.List;

public interface PatientServiceInterface {
    Patient getPatientById(Long id);
    List<Patient> getAllPatients();
    void deletePatient(Long id);
    Patient addPatient(Patient patient);
}
