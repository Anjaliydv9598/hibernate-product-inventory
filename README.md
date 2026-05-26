# Product Inventory Management

A simple Java-based project to manage product records using Hibernate and PostgreSQL. This project focuses on implementing basic CRUD operations and understanding how ORM works in a real-world setup.

---

## Tech Stack

* Java
* Hibernate (JPA)
* PostgreSQL
* Maven

---

## What this project does

* Save product details into the database
* Fetch and display product data
* Update existing product records
* Delete products when needed

---

## Project Structure

```
src/main/java/
  ├── Product.java
  ├── SaveProduct.java

src/main/resources/
  └── META-INF/persistence.xml
```

---

## Database Setup

Create a PostgreSQL database:

```
CREATE DATABASE product_db;
```

Update your database credentials in `persistence.xml`.

---

## How to Run

1. Clone the repository
2. Open the project in Eclipse or IntelliJ
3. Configure PostgreSQL credentials
4. Run `SaveProduct.java`

---

## About the Project

This project was built as part of my practice while learning Hibernate. It helped me understand entity mapping, persistence, and how Java applications interact with databases using ORM.

---

## Future Improvements

* Add REST APIs using Spring Boot
* Build a frontend UI
* Add validations and exception handling

---

## Author

Anjali Yadav

---
