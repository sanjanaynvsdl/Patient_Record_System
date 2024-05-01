package com.example.patientrecordsystem.CustomExceptions;

public class PatientNotFound extends RuntimeException {

    public PatientNotFound(String message) {
        super(message);
    }

}
