package com.example.patientrecordsystem.Service;

import com.example.patientrecordsystem.CustomExceptions.MedicalHistoryInvalid;
import com.example.patientrecordsystem.Models.MedicalHistory;
import com.example.patientrecordsystem.Models.Patient;
import com.example.patientrecordsystem.Repositeries.MedicalHistoryRepository;
import com.example.patientrecordsystem.Repositeries.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalHistoryService implements MedicalHistoryServiceInterface {

    private final MedicalHistoryRepository medicalHistoryRepository;
    private final PatientRepository patientRepository;

    public MedicalHistoryService(MedicalHistoryRepository medicalHistoryRepository, PatientRepository patientRepository) {
        this.medicalHistoryRepository = medicalHistoryRepository;
        this.patientRepository = patientRepository;
    }


    @Override
    public void deleteHistory(Long id) {
        medicalHistoryRepository.deleteById(id);
    }

    @Override
    public MedicalHistory addHistory(MedicalHistory medicalHistory) {
        Patient patient = medicalHistory.getPatient();
        if (patient.getId() == null) {
            Patient savedPatient = patientRepository.save(patient);
            medicalHistory.setPatient(savedPatient);
        }
        return medicalHistoryRepository.save(medicalHistory);
    }

    @Override
    public List<MedicalHistory> getAllHistory() {
        return medicalHistoryRepository.findAll();
    }
    @Override
    public List<MedicalHistory> getAllHistoryByPatientId(Long patientId) {
        if(patientRepository.findById(patientId).isEmpty()) {
            throw new MedicalHistoryInvalid("Patient not found with id: " );
        }
        return medicalHistoryRepository.findAllByPatientId(patientId);
    }
}
