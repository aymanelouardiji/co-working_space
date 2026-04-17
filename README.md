# Friends Workspace

Friends Workspace is a full-stack coworking management platform that helps teams manage desks, workspaces, users, and shared amenities in one place. The application includes secure authentication, role-based permissions, booking workflows, and admin reporting.

## Project Overview
- Members can browse workspaces, reserve desks, and manage their own bookings.
- Space managers can manage desks, amenities, and booking approvals.
- Admins can manage users and view global usage reports.
- The system is built with a Spring Boot REST API and a React frontend, connected through JWT-based authentication.

## Main Features
- Authentication and authorization with role-based access (`ADMIN`, `SPACE_MANAGER`, `MEMBER`)
- Workspace and desk management
- Booking lifecycle management (request, confirm, check-in, check-out, cancel)
- Amenity reservation and approval workflow
- Dashboard and reporting views for admins/managers

## Tech Stack
- Backend: Spring Boot
- Frontend: React (Vite)

## Run Locally
1. Backend
```bash
cd backend
mvn spring-boot:run
```
2. Frontend
```bash
cd frontend
npm install
npm run dev
```

## Architecture (Backend)
- `Controller -> Service -> Repository`
- Controllers expose REST endpoints.
- Services contain business rules and validation.
- Repositories handle database access with Spring Data JPA.

## API + Frontend Integration
- Backend runs on `http://localhost:8080`
- Frontend runs on `http://localhost:5173`
- Frontend uses Axios with a base URL configured in `frontend/src/services/api.js`
- CORS and JWT security are configured in backend security settings

## Notes
This is a group project.

This project was developed as a group work by me and Ilyas El Alaoui Saleh.
