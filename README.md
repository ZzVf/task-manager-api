# Task Manager API

A REST API for task management built with Spring Boot, JPA/Hibernate and PostgreSQL.

## Tech Stack
- Java 21
- Spring Boot 3.5
- PostgreSQL
- Docker & Docker Compose
- JPA/Hibernate

## Architecture
- Controller → Service → Repository pattern
- Custom exception handling (404)
- Environment variables with .env

## Endpoints
| Method | URL | Description |
|--------|-----|-------------|
| GET | /tasks | Get all tasks |
| GET | /tasks/{id} | Get task by id |
| POST | /tasks | Create a task |
| PUT | /tasks/{id} | Update a task |
| DELETE | /tasks/{id} | Delete a task |

## Run with Docker
```bash
docker-compose up --build
```

## Run locally
```bash
./mvnw spring-boot:run
```
