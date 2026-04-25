# Product Service

A RESTful product microservice built with Spring Boot 3.

## 📦 Tech Stack

* Java 17
* Spring Boot 3
* Spring Web
* Spring Data JPA
* H2 Database

## 🚀 How to Run

```bash
mvn spring-boot:run
```

Application runs on:

```
http://localhost:8080
```

---

## 📡 API Endpoints

| Method | Endpoint       | Description          |
| ------ | -------------- | -------------------- |
| GET    | /products      | Get all products     |
| GET    | /products/{id} | Get product by ID    |
| POST   | /products      | Create a new product |
| GET    | /health        | Service health check |

---

## 🧪 Example Request

### Create Product

```bash
curl -X POST http://localhost:8080/products \
-H "Content-Type: application/json" \
-d '{"name":"Laptop","price":1200}'
```

---

## 🗄 Database

* H2 in-memory database
* Accessible at:

```
http://localhost:8080/h2-console
```

---

## 📁 Project Structure

```
controller/   -> REST API endpoints
service/      -> Business logic
repository/   -> Database access
model/        -> Entity classes
```

---

## ✅ Status

✔ Working REST API
✔ Layered Architecture
✔ H2 Database Integration

---
