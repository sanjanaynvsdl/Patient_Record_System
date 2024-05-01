package com.example.patientrecordsystem.Service;

import com.example.patientrecordsystem.CustomExceptions.AppointmentNotFound;
import com.example.patientrecordsystem.CustomExceptions.PatientNotFound;
import com.example.patientrecordsystem.Models.Appointment;
import com.example.patientrecordsystem.Models.Patient;
import com.example.patientrecordsystem.Repositeries.AppointmentRepository;
import com.example.patientrecordsystem.Repositeries.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService implements AppointmentServiceInterface{
    private final AppointmentRepository appointmentRepository;
    private final PatientRepository patientRepository;
    public AppointmentService(AppointmentRepository appointmentRepository, PatientRepository patientRepository) {
        this.appointmentRepository = appointmentRepository;
        this.patientRepository = patientRepository;
    }
    @Override
    public List<Appointment> getAllAppointmentsByPatientId(Long patientId) {
        if(!patientRepository.existsById(patientId)) {
            throw new AppointmentNotFound("Not found");
        }
        return appointmentRepository.findAllByPatientId(patientId);
    }
    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }
    @Override
    public Appointment updateAppointment(Appointment appointment) {
        Patient patient = appointment.getPatient();
        if(patient.getId() == null){
            Patient savedPatient = patientRepository.save(patient);
            appointment.setPatient(savedPatient);
        }
        return appointmentRepository.save(appointment);
    }
    @Override
    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }

}