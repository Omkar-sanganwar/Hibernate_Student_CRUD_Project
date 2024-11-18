package com.nov14;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class ClientCriteria {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		try {
			List<Student> studentsGt = session.createCriteria(Student.class).add(Restrictions.gt("marks", 50)) // marks
																												// > 50
					.list();
			System.out.println("Students with marks > 50:");
			for (Student student : studentsGt) {
				System.out.println(student);
			}

			List<Student> studentsGe = session.createCriteria(Student.class).add(Restrictions.ge("marks", 60)).list();
			System.out.println("\nStudents with marks >= 60:");
			for (Student student : studentsGe) {
				System.out.println(student);
			}

			List<Student> studentsLike = session.createCriteria(Student.class).add(Restrictions.like("name", "o%"))
					.list();
			System.out.println("\nStudents whose name starts with 'A':");
			for (Student student : studentsLike) {
				System.out.println(student);
			}

			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		} finally {
			session.close();
			factory.close();
		}
	}
}
