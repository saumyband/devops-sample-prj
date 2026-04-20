# NoteFlow API

NoteFlow API is a simple Spring Boot backend service for managing notes.
It was built as a DevOps portfolio project to demonstrate Docker, GitHub Actions, Terraform, and AWS deployment skills.

## Features

- Get all notes
- Get note by ID
- Create a note
- Delete a note
- Health check endpoint

## Tech Stack

- Java 17
- Spring Boot
- Maven
- Docker
- GitHub Actions
- Terraform
- AWS EC2
- Nginx

## API Endpoints

- `GET /notes`
- `GET /notes/{id}`
- `POST /notes`
- `DELETE /notes/{id}`
- `GET /actuator/health`

## Run Locally

### 1. Start the application
mvnw.cmd spring-boot:run

### 2. Build the JAR
mvnw.cmd clean package

### 3. Build Docker image
docker build -t noteflow-api .

### 4. Run Docker container
docker run -p 8080:8080 noteflow-api

## Sample Request
### Create a Note
POST /notes
Content-Type: application/json

{
  "title": "Learn DevOps",
  "content": "Practice Docker, Terraform, and AWS"
}

## Project Goal
The goal of this project is to learn and demonstrate:
containerization with Docker
CI/CD with GitHub Actions
infrastructure provisioning with Terraform
cloud deployment on AWS

## Author
Built by Saumya Band
