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
- SOLID principles applied (Single Responsibility, Dependency Inversion)

## Design Principles
- **Single Responsibility** — each layer has one role: Controller handles HTTP, Service handles business logic, Repository handles data access
- **Dependency Inversion** — dependencies are injected via constructors, not instantiated directly
- **TDD** — unit tests written for service layer to verify business logic (e.g. exception thrown when task not found)

## Endpoints
| Method | URL | Description |
|--------|-----|-------------|
| GET | /tasks | Get all tasks |
| GET | /tasks/{id} | Get task by id |
| POST | /tasks | Create a task |
| PUT | /tasks/{id} | Update a task |
| DELETE | /tasks/{id} | Delete a task |

## Prerequisites
- Java 21
- PostgreSQL
- Docker & Docker Compose
- IntelliJ IDEA with [EnvFile plugin](https://plugins.jetbrains.com/plugin/7861-envfile) (for local development)

## Setup
1. Clone the repository
2. Copy `env.example` to `.env` and fill in your values
3. Run with Docker:
```bash
docker-compose up --build
```

## Run locally (IntelliJ)
1. Install the **EnvFile** plugin in IntelliJ
2. Enable EnvFile in Run Configuration and point it to your `.env`
3. Run `TaskmanagerApplication`
