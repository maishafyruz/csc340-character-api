# CSC 340 – Character MVC Web App

## Description
This project extends the previous Character CRUD API into a full-stack web application using Spring Boot, FreeMarker, and PostgreSQL (Neon database).

The application allows users to:
- View all characters
- View character details
- Create characters
- Update characters
- Delete characters
- Search characters by name
- Filter characters by universe (category)

The application uses server-side rendering with FreeMarker templates.

---

## Technologies Used
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- FreeMarker
- PostgreSQL (Neon Database)
- Maven
- HTML/CSS

---

## MVC Features
- Uses @Controller and Model to pass data to views
- FreeMarker templates (.ftlh) for UI rendering
- Dynamic data display using loops and variables
- Forms for creating and updating characters
- Navigation between pages (list, details, create, update)

---

## Setup Instructions

### 1. Clone the repository
git clone https://github.com/maishafyruz/csc340-character-api.git  
cd csc340-character-api

### 2. Configure the database
Update src/main/resources/application.properties:

spring.datasource.url=dbc:postgresql://ep-floral-lake-aik3mt8a-pooler.c-4.us-east-1.aws.neon.tech:5432/neondb?sslmode=require  
spring.datasource.username=neondb_owner
spring.datasource.password=PASSWORD  

spring.jpa.hibernate.ddl-auto=update  
spring.jpa.show-sql=true  

### 3. Run the application
./mvnw spring-boot:run  

Open in browser:  
http://localhost:8080/all  

---

## Features Demonstrated
- Full CRUD operations via web UI
- Persistent data using PostgreSQL
- Dynamic UI using FreeMarker
- Search by name
- Filter by universe/category (For extra credit)

---

## Demo Video
[Watch the MVC demo video here](PASTE-YOUR-NEW-VIDEO-LINK)

---

## Author
Maisha Fyruz  
CSC 340 – Spring 2026