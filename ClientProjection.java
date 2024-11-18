package com.nov14;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class ClientProjection {
    public static void main(String[] args) {
        // Set up Hibernate configuration
        Configuration cfg = new Configuration();
        cfg.configure(); // Loads hibernate.cfg.xml
        cfg.addAnnotatedClass(Student.class); // Add your annotated Student class

        // Create SessionFactory
        SessionFactory factory = cfg.buildSessionFactory();

        // Open a session
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            // Select 'rollNo', 'name', and 'marks' fields from the Student table
            List<Object[]> students = session.createCriteria(Student.class)
                    .setProjection(Projections.projectionList()
                        .add(Projections.property("roll_No"))   // Select 'roll_No' field
                        .add(Projections.property("name"))     // Select 'name' field
                        .add(Projections.property("marks"))    // Select 'marks' field
                    )
                    .add(Restrictions.gt("marks", 50))  // Example restriction, marks > 50
                    .list();

            // Print the fetched data
            for (Object[] student : students) {
                System.out.println("Roll No: " + student[0] + ", Name: " + student[1] + ", Marks: " + student[2]);
            }

            // Commit the transaction
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) transaction.rollback();
        } finally {
            // Close session and factory
            session.close();
            factory.close();
        }
    }
}
