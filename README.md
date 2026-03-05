# CSC 340 – Character CRUD API

## Description
This project implements a RESTful Character CRUD API using Spring Boot, Spring Data JPA, and PostgreSQL (Neon database).

The API allows users to:
- Create characters
- Retrieve characters
- Update characters
- Delete characters
- Filter characters by category
- Search characters by name

The API was tested using Postman.

---

# Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL (Neon Database)
- Maven
- Postman

---

# Installation and Setup

## 1. Clone the repository

```bash
git clone https://github.com/YOUR_GITHUB_USERNAME/csc340-character-api.git
cd csc340-character-api
```

## 2. Configure the database

Create a PostgreSQL database using Neon and update the following properties in:

```
src/main/resources/application.properties
```

Example configuration:

```
spring.datasource.url=YOUR_DATABASE_URL
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 3. Run the application

Start the Spring Boot application:

```bash
./mvnw spring-boot:run
```

The API will run at:

```
http://localhost:8080
```

---

# API Endpoints

## Create Character

POST `/characters`

Example request body:

```json
{
  "name": "Wonder Woman",
  "description": "Amazon warrior princess",
  "universe": "DC",
  "power": "Super strength"
}
```

---

## Get All Characters

GET `/characters`

Returns a list of all characters.

---

## Get Character by ID

GET `/characters/{id}`

Example:

```
GET /characters/1
```

---

## Update Character

PUT `/characters/{id}`

Example request body:

```json
{
  "name": "Wonder Woman",
  "description": "Amazon warrior princess of Themyscira",
  "universe": "DC",
  "power": "Super strength and combat skill"
}
```

---

## Delete Character

DELETE `/characters/{id}`

Example:

```
DELETE /characters/1
```

---

## Filter Characters by Category

GET `/characters/category/{category}`

Example:

```
GET /characters/category/Marvel
```

---

## Search Characters by Name

GET `/characters/search?name=substring`

Example:

```
GET /characters/search?name=witch
```

---

# Error Handling

The API returns appropriate HTTP status codes for invalid requests.

Example:

**404 Not Found**

```
GET /characters/999
```

Occurs when a character ID does not exist.

**400 Bad Request**

Occurs when required fields are missing or invalid during character creation.

---

# Demo Video

Video demonstration of the API:

https://uncg-my.sharepoint.com/:v:/g/personal/m_fyruz_uncg_edu/IQCFq2fJDQKDQoICFmgg16siAdq6JGNusC98UA8keoWWRA8?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJPbmVEcml2ZUZvckJ1c2luZXNzIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXciLCJyZWZlcnJhbFZpZXciOiJNeUZpbGVzTGlua0NvcHkifX0&e=i93n0r

---

# Author

Maisha Fyruz  
CSC 340 – Spring 2026