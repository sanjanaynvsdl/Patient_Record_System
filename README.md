# Patient Record System

A comprehensive backend solution for managing patient records, medical histories, and appointments, built with Java Spring Boot and MySQL.

## Features

- Patient Profile Management
- Medical History Management
- Appointment Scheduling and Management
- Global Exception Handling

## Technologies

- Java Spring Boot
- MySQL Database
- JSON Web Tokens (JWT) for Authentication

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or later
- MySQL Server
- Maven

### Installation

1. Clone the repository:
   ```
   https://github.com/sanjanaynvsdl/Patient_Record_System.git
   ```

2. Navigate to the project directory:
   ```
   cd patient-record-system
   ```

3. Configure MySQL database connection in `src/main/resources/application.properties`:
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/patient_record_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

4. Build the project:
   ```
   mvn clean install
   ```

5. Run the application:
   ```
   mvn spring-boot:run
   ```

## API Endpoints

### Patients

- `GET /patients` - Retrieve all patients
- `GET /patients/{id}` - Retrieve a patient by ID
- `POST /patients` - Create a new patient
- `DELETE /patients/{id}` - Delete a patient

### Medical History

- `GET /history` - Retrieve all medical histories
- `GET /history/{patientId}` - Retrieve medical history for a specific patient
- `PUT /history` - Add a new medical history entry
- `DELETE /history/{id}` - Delete a medical history entry

### Appointments

- `GET /appointments` - Retrieve all appointments
- `GET /appointments/{patientId}` - Retrieve appointments for a specific patient
- `PUT /appointments` - Update an appointment
- `DELETE /appointments/{id}` - Delete an appointment

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
