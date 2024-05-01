package com.example.patientrecordsystem.Service;

import com.example.patientrecordsystem.Models.Appointment;
import com.example.patientrecordsystem.Models.Patient;

import java.util.List;
import java.util.Optional;

public interface AppointmentServiceInterface{
    List<Appointment> getAllAppointments();
    Appointment updateAppointment(Appointment appointment);
    void deleteAppointment(Long id);
    List<Appointment> getAllAppointmentsByPatientId(Long patientId);
}
