package com.nov14;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDelete {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		int rollNoToDelete = 2;
		Student student = session.get(Student.class, rollNoToDelete);

		if (student != null) {
			session.delete(student);
			transaction.commit();
			System.out.println("Student deleted: " + student);
		} else {
			System.out.println("Student with rollNo " + rollNoToDelete + " not found.");
		}

		session.close();
	}
}
