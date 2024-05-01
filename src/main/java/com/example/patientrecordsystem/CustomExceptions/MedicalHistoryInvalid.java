package com.example.patientrecordsystem.CustomExceptions;

public class MedicalHistoryInvalid extends RuntimeException{

        public MedicalHistoryInvalid(String message) {
            super(message);
        }
}
