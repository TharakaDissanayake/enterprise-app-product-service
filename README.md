# product-service

A Spring Boot microservice for managing products, built with MongoDB as the database. This service provides RESTful endpoints for CRUD operations and exemplifies modern Java best practices.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the App](#running-the-app)
- [Testing](#testing)
- [API Endpoints](#api-endpoints)
- [Configuration](#configuration)
- [Contributing](#contributing)
- [License](#license)

## Overview

**product-service** is a Spring Boot-based REST API service offering full CRUD capabilities for products. It leverages MongoDB for persistence, uses Lombok for boilerplate reduction, and is designed for scalability and ease of deployment.

## Features

- RESTful API for managing product data
- MongoDB integration via Spring Data
- Automated tests with JUnit and Testcontainers
- Built with Spring Boot 3.5.7 and Java 25
- Configurable via `application.properties` or `application.yml`
- CI/CD friendly with Maven Wrapper

## Tech Stack

- Java 25
- Spring Boot 3.5.7
- Spring Data MongoDB
- Lombok
- Maven
- JUnit & Testcontainers

## Getting Started

### Prerequisites

- Java JDK 17 or higher
- Maven 3.8+ (included via Maven Wrapper)
- MongoDB (local or Dockerized)

### Installation

Clone the repository:

