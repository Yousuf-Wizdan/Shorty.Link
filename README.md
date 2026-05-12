# Shorty: URL Shortener using Spring Boot

A robust, lightweight URL shortening application built using the Spring Boot framework. Shorty allows users to convert long, complex URLs into clean, manageable links, complete with automatically generated QR codes, link usage analytics, and email notification capabilities.

---

## Features

- **Link Shortening**: Convert long URLs into compact short links.
- **Custom Backhalves**: Choose your own custom alias/backhalf (e.g., `shorty.link/aiml-roadmap`) with support for alphanumeric characters, hyphens, and underscores.
- **QR Code Generation**: Automatically generate and download custom QR codes for every shortened link (powered by Google ZXing).
- **Email Integration**: Integrated mail notification service for account and link alerts.
- **Database Persistence**: Powered by Hibernate and JPA with MySQL.
- **DevOps Friendly**: Multi-environment config and easy database provisioning using Docker.

---

## Project Structure

- **`src/main/java/com/yousuf/shorty`**: Contains the source code (Controllers, Models, Repositories, and Services).
- **`src/main/webapp`**: Front-end JSP files, CSS, JS, and media assets.
- **`pom.xml`**: Maven configurations, dependencies, and plugin declarations.
- **`mvnw` / `mvnw.cmd`**: Maven Wrapper files for platform-independent compilation and builds.

---

## Technical Stack & Dependencies

- **Core Framework**: Spring Boot 3.2.0
- **Java Version**: JDK 21
- **Database & ORM**: Spring Boot Data JPA, Hibernate, MySQL Connector/J
- **Templating Engine**: Embedded Tomcat, Tomcat Jasper, Jakarta Servlet JSP JSTL
- **Utility Libraries**: Lombok, Jakarta Validation API
- **QR Code Generation**: Google ZXing (Core & JavaSE)
- **Monitoring & DevTools**: Spring Boot Actuator, Spring Boot DevTools

---

## Getting Started

### Prerequisites

- **Java**: JDK 21 or later
- **Docker**: For running a local database instance easily

### 1. Database Setup (MySQL via Docker)

Shorty is pre-configured to connect to a MySQL database named `milliurl` on port `3306`. Run the following command to spin up a compatible MySQL container:

```powershell
docker run --name shorty-mysql -e MYSQL_ROOT_PASSWORD=Jasmitha@1 -e MYSQL_DATABASE=milliurl -p 3306:3306 -d mysql:8.0
```

### 2. Run the Application

Navigate to the project root directory and start the Spring Boot server using the Maven wrapper:

```powershell
# Windows
.\mvnw spring-boot:run

# Linux / macOS
./mvnw spring-boot:run
```

Once started, open your browser and access the application at:
[http://localhost:8080](http://localhost:8080)

---

## Authors & License

Maintained and customized by **Yousuf-Wizdan**.
Licensed under the MIT License.
