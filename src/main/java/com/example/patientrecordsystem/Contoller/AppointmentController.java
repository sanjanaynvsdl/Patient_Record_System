package com.example.patientrecordsystem.Contoller;

import com.example.patientrecordsystem.Models.Appointment;
import com.example.patientrecordsystem.Service.AppointmentServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    private final AppointmentServiceInterface appointmentServiceInterface;
    public AppointmentController(AppointmentServiceInterface appointmentServiceInterface) {
        this.appointmentServiceInterface = appointmentServiceInterface;
    }
    @GetMapping
    public List<Appointment> getAllAppointments() {

        return appointmentServiceInterface.getAllAppointments();
    }
    @GetMapping("/{patientId}")
    public List<Appointment> getAllAppointmentsByPatientId(@PathVariable("patientId") Long patientId) {
        return appointmentServiceInterface.getAllAppointmentsByPatientId(patientId);
    }
    @PutMapping()
    public Appointment updateAppointment(@RequestBody Appointment appointment) {
           return appointmentServiceInterface.updateAppointment(appointment);
    }
    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable("id") Long id) {
        appointmentServiceInterface.deleteAppointment(id);
    }


}
