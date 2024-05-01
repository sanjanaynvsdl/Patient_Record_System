package com.example.patientrecordsystem.Exceptions;

import com.example.patientrecordsystem.CustomExceptions.AppointmentNotFound;
import com.example.patientrecordsystem.CustomExceptions.MedicalHistoryInvalid;
import com.example.patientrecordsystem.CustomExceptions.PatientNotFound;
import com.example.patientrecordsystem.DTOs.ExceptionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ExceptionDTO> handleArithematicException(){
        ExceptionDTO dto=new ExceptionDTO();
        dto.setMessage("Something went wrong");
        dto.setResolution("Arithematic Exception Occured");
        ResponseEntity<ExceptionDTO> response=new ResponseEntity<>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
        return response;
    }
    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public ResponseEntity<ExceptionDTO> handleArrayIndexOutOfBoundsException(){
        ExceptionDTO dto=new ExceptionDTO();
        dto.setMessage("Something went wrong");
        dto.setResolution("Array Index Out Of Bounds Exception Occured");
        ResponseEntity<ExceptionDTO> response=new ResponseEntity<>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
        return response;
    }
    @ExceptionHandler(PatientNotFound.class)
    public ResponseEntity<ExceptionDTO> handlePatienttNotFound(PatientNotFound ex) {
        {
            ExceptionDTO dto = new ExceptionDTO();
            dto.setMessage("Invalid patient id passed");
            dto.setResolution("Please provide a valid patient id");
            ResponseEntity<ExceptionDTO> response = new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
            return response;
        }
    }
    @ExceptionHandler(AppointmentNotFound.class)
    public ResponseEntity<ExceptionDTO> handleAppointmentNotFound(AppointmentNotFound ex) {
        {
            ExceptionDTO dto = new ExceptionDTO();
            dto.setMessage("Invalid  id passed");
            dto.setResolution("Please provide a valid patient id for appointmnent details");
            ResponseEntity<ExceptionDTO> response = new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
            return response;
        }
    }
    @ExceptionHandler(MedicalHistoryInvalid.class)
    public ResponseEntity<ExceptionDTO> handleMedicalHistoryInvalid(MedicalHistoryInvalid ex) {
        {
            ExceptionDTO dto = new ExceptionDTO();
            dto.setMessage("Invalid patient Id passed for medical history details");
            dto.setResolution("Please provide a valid patient id for medical history details");
            ResponseEntity<ExceptionDTO> response = new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
            return response;
        }
    }

}
