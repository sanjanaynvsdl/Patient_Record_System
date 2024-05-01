package com.example.patientrecordsystem.CustomExceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppointmentNotFound extends RuntimeException{
//    private  Long id;
        public AppointmentNotFound(String message) {
            super(message);


        }
}
