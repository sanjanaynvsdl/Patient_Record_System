package com.example.patientrecordsystem.Service;

import com.example.patientrecordsystem.Models.MedicalHistory;

import java.util.List;
import java.util.Optional;

public interface MedicalHistoryServiceInterface {
    void deleteHistory(Long id);
    MedicalHistory addHistory(MedicalHistory medicalHistory);
    List<MedicalHistory> getAllHistory();
    List<MedicalHistory> getAllHistoryByPatientId(Long patientId);
}
