package com.example.patientrecordsystem.Contoller;

import com.example.patientrecordsystem.Models.Appointment;
import com.example.patientrecordsystem.Models.MedicalHistory;
import com.example.patientrecordsystem.Service.MedicalHistoryServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/history")
public class MedicalHistoryController {
    private final MedicalHistoryServiceInterface medicalHistoryServiceInterface;

    public MedicalHistoryController(MedicalHistoryServiceInterface medicalHistoryServiceInterface) {
        this.medicalHistoryServiceInterface = medicalHistoryServiceInterface;
    }
    @GetMapping
    public List<MedicalHistory> getAllHistory() {
        return medicalHistoryServiceInterface.getAllHistory();
    }
    @GetMapping("/{patientId}")
    public List<MedicalHistory> getAllHistoryByPatientId(@PathVariable("patientId") Long patientId) {
        return medicalHistoryServiceInterface.getAllHistoryByPatientId(patientId);
    }
    @PutMapping()
    public MedicalHistory addHistory(@RequestBody MedicalHistory medicalHistory) {
        return medicalHistoryServiceInterface.addHistory(medicalHistory);
    }
    @DeleteMapping("/{id}")
    public void deleteHistory(@PathVariable("id") Long id) {
        medicalHistoryServiceInterface.deleteHistory(id);
    }
}
