package com.nov14;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientUpdate {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Student student = session.get(Student.class, 1);
		if (student != null) {
			student.setMarks(95);
			session.update(student);
			transaction.commit();
			System.out.println("Student updated: " + student);
		} else {
			System.out.println("Student with rollNo 1 not found.");
		}

		session.close();
	}
}
