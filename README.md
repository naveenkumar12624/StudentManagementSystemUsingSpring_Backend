# Student Management System - Spring Boot + MySQL

This is a backend RESTful API application for managing students and their course enrollments. Built using **Spring Boot**, it connects to a **MySQL database** to perform CRUD operations and manage a many-to-many relationship between Students and Courses.


## Features

- Add, update, delete, and fetch student details.
- Assign courses to students.
- Handle exceptions with meaningful messages.
- Connects to MySQL using Spring Data JPA.
- RESTful API architecture with proper HTTP status codes.


## Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Gradle
- REST APIs
- Jakarta Persistence API


## Project Structure

```plaintext
com.example.studentmanagement
│
├── controller             // REST Controllers (StudentController)
├── model                 // Entity classes (Student, Course)
├── repository            // Spring Data JPA Repositories
├── service               // Business logic (StudentService)
├── exception             // Custom exception & global handler
└── StudentManagementApplication.java   // Main class
