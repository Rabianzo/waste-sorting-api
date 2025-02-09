# waste-sorting-api
# Waste Sorting Application - REST API

## **Project Overview**
The **Waste Sorting Application** is a RESTful API built using **Spring Boot** to support Enviro365’s mobile application for sustainable waste management. The API enables users to retrieve, store, update, and delete waste category information, including proper disposal guidelines and recycling tips.

## **Problem Statement**
Waste mismanagement is a growing environmental issue, leading to pollution and resource wastage. Many individuals lack proper knowledge of how to **sort, recycle, and dispose of waste correctly**. To address this, **Enviro365** is developing a mobile application to educate users about proper waste disposal.  

As a backend developer, my task was to **develop a REST API** to handle data exchange between the frontend and backend of the application.

## **Solution**
To tackle this problem, I built a **Spring Boot REST API** with the following key functionalities:
- **Retrieve all waste categories** stored in the system.
- **Retrieve a single waste category** by its ID.
- **Add new waste categories** with their respective disposal guidelines and recycling tips.
- **Delete waste categories** when they are no longer needed.
- **Validate inputs** to ensure all data stored is correct and meaningful.

The API stores data in an **H2 in-memory database**, making it lightweight and efficient for testing. It follows **best practices in RESTful API development**, including proper request handling, validation, and structured responses.

## **Technologies Used**
- **Java 17** – Primary programming language.
- **Spring Boot** – Framework for building the REST API.
- **Spring Web** – To handle HTTP requests and responses.
- **Spring Data JPA** – For database interaction.
- **H2 Database** – In-memory database for easy testing.
- **Lombok** – To reduce boilerplate code in Java classes.
- **Jakarta Validation** – To enforce input validation.

## **How to Run the Project**
1. Clone the repository:
   
   git clone https://github.com/Rabianzo/waste-sorting-api.git
   
   cd waste-sorting-api

## **Build and run the application using Maven:**
   mvn spring-boot:run

## **The API will be accessible at:**
   http://localhost:8080/api/waste-categories

## **Future Enhancements**
  - Implement user authentication for managing waste categories.
  - Add pagination and filtering for large data sets.
  - Connect to a real-world database (e.g., PostgreSQL, MySQL)

## **Author**
    Morena R. Macheka
    LinkedIn: https://www.linkedin.com/in/morena-r-macheka-232b26149/
    Github:   https://github.com/Rabianzo
    email:    morenamacheka@gmail.com
