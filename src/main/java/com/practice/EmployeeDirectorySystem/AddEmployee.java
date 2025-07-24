package com.practice.EmployeeDirectorySystem;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import employee.Entity.Employee;
import employee.Utility.HibernateUtility;

public class AddEmployee {

	public void addEmployee() {

		// 1. Session Factory
		SessionFactory factory = HibernateUtility.getSessionFactory();

		// 2. Session From Session Factory
		Session session = factory.openSession();

		// 3. Transaction from session
		Transaction transaction = session.beginTransaction();

		System.out.println("Add Student Details : ");

		Employee s = new Employee();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter New Employee ID :");
		s.setId(sc.nextInt());
		sc.nextLine(); // To avoid continuos input from console

		System.out.println("Enter Employee Name : ");
		s.setName(sc.nextLine());

		System.out.println("Enter Employee Department : ");
		s.setDepartment(sc.nextLine());

		System.out.println("Enter Employee Designation : ");
		s.setDesignation(sc.nextLine());

		System.out.println("Enter Salary  : ");
		s.setSalary(sc.nextDouble());

		// 4. Save process
		session.persist(s);

		// 5. pass to databases
		transaction.commit();

		// 6.close session
		session.close();

	}

}
