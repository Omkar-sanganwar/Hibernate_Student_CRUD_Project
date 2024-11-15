# Hibernate Student CRUD Project


This project demonstrates basic CRUD (Create, Read, Update, Delete) operations using Hibernate, a popular ORM (Object-Relational Mapping) framework, with a MySQL database. The project manages student records, including their roll number, name, and marks, in the database.

# Features :-
- 'Insert': Add new student records to the database.
- 'Select':Retrieve and display student records by their roll_no.
- 'Update': Modify existing student records.
- 'Delete': Remove student records from the database.
- 'Save or Update': Add a new record or update an existing one.

# Prerequisites:-
- Java Development Kit (JDK) 8 or later
- Maven
- MySQL Database
- Hibernate 5.6.15.Final
- MySQL Connector/J 8.0.33

# Technologies Used:-
- Hibernate ORM Framework
 - MySQL
 -  Java

# Project Structure:

- **src/main/java/com/nov14/**
  - `Student.java`                : Entity class mapped to the 'students' table
  - `ClientInsert.java`           : Demonstrates the insert operation
  - `ClientSelect.java`           : Demonstrates the select operation
  - `ClientUpdate.java`           : Demonstrates the update operation
  - `ClientDelete.java`           : Demonstrates the delete operation
  - `ClientSaveOrUpdate.java`     : Demonstrates save or update operation

- **src/main/resources/**
  - `hibernate.cfg.xml`           : Hibernate configuration file
  - `pom.xml`                       : Maven configuration file
  - `README.md`                     : Project documentation


 
