package com.example.patientrecordsystem.Repositeries;

import com.example.patientrecordsystem.Models.Appointment;
import com.example.patientrecordsystem.Models.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory,Long> {
    void deleteById(Long id);
    MedicalHistory save(MedicalHistory medicalHistory);
    List<MedicalHistory> findAll();
    List<MedicalHistory> findAllByPatientId(Long patientId);
}
