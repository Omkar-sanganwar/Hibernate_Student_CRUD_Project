Hibernate Student CRUD Project
This project demonstrates basic CRUD (Create, Read, Update, Delete) operations using Hibernate, a popular ORM (Object-Relational Mapping) framework, with a MySQL database. The project manages student records, including their roll number, name, and marks, in the database.

#Features :-
1)Insert: Add new student records to the database.
2)Select: Retrieve and display student records by their roll_no.
3)Update: Modify existing student records.
4)Delete: Remove student records from the database.
5)Save or Update: Add a new record or update an existing one.

#Prerequisites:-
1)Java Development Kit (JDK) 8 or later
2)Maven
3)MySQL Database
4)Hibernate 5.6.15.Final
5)MySQL Connector/J 8.0.33

#Technologies Used:-
1)Hibernate ORM Framework
2)MySQL
3)Java

#Project Structure:-
 
Hibernate_Student_CRUD_Project/
├── src/main/java/com/nov14/
│   ├── Student.java                 # Entity class mapped to the 'students' table
│   ├── ClientInsert.java            # Demonstrates the insert operation
│   ├── ClientSelect.java            # Demonstrates the select operation
│   ├── ClientUpdate.java            # Demonstrates the update operation
│   ├── ClientDelete.java            # Demonstrates the delete operation
│   └── ClientSaveOrUpdate.java      # Demonstrates save or update operation
├── src/main/resources/
│   ├── hibernate.cfg.xml            # Hibernate configuration file
├── pom.xml                          # Maven configuration file
└── README.md                        # Project documentation

 
