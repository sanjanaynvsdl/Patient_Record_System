package com.example.patientrecordsystem.Repositeries;

import com.example.patientrecordsystem.Models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
    void deleteById(Long id);
    Appointment save(Appointment appointment);
    List<Appointment> findAll();
    List<Appointment> findAllByPatientId(Long patientId);
}
