# Friends Workspace

A full-stack co-working desk booking and amenity management platform with role-based access control (Admin, Space Manager, Member), JWT authentication, and real-time availability tracking.

## Tech Stack

**Backend:** Java 17, Spring Boot 3.2, Spring Security, Spring Data JPA, PostgreSQL, JWT (jjwt), Lombok, Swagger/OpenAPI, Maven

**Frontend:** React 19, Vite 5, React Router v7, Axios, Lucide React

## Getting Started

### Prerequisites
- Java 17+, Maven 3.9+, Node.js 18+, PostgreSQL 14+

### 1. Database
```sql
CREATE DATABASE coworking_db;
```
Update `backend/src/main/resources/application.properties` with your PostgreSQL credentials.

### 2. Backend
```bash
cd backend
mvn clean install
mvn spring-boot:run
```
Runs on `http://localhost:8080` — Swagger UI at `/swagger-ui/index.html`.

### 3. Frontend
```bash
cd frontend
npm install
npm run dev
```
Runs on `http://localhost:5173`.

## Credits

This project was developed as a group work by me and Ilyass El Allaoui.
