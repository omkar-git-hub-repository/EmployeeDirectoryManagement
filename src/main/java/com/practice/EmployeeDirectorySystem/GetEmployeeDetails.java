package com.practice.EmployeeDirectorySystem;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import employee.Entity.Employee;
import employee.Utility.HibernateUtility;

public class GetEmployeeDetails {

	public void getAllStudentDetails() {

		// 1. Session Factory
		SessionFactory factory = HibernateUtility.getSessionFactory();

		// 2. Session From Session Factory
		Session session = factory.openSession();

		// 3. Transaction from session
		Transaction transaction = session.beginTransaction();

		List<Employee> studentlist = session.createQuery("SELECT s FROM Employee s", Employee.class).getResultList();
		studentlist.stream().forEach(k -> System.out.println(k.toString()));

		transaction.commit();
		session.close();
	}

	public void getByID() {

		// 1. Session Factory
		SessionFactory factory = HibernateUtility.getSessionFactory();

		// 2. Session From Session Factory
		Session session = factory.openSession();

		// 3. Transaction from session
		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id : ");
		int id = sc.nextInt();

		Employee st = session.find(Employee.class, id);

		System.out.println(st.toString());

		// 4. Save process
		// session.persist(s);

		// 5. pass to database
		transaction.commit();

		// 6.close session
		session.close();

	}

}
