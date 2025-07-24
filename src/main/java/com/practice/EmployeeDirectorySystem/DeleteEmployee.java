package com.practice.EmployeeDirectorySystem;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import employee.Entity.Employee;
import employee.Utility.HibernateUtility;



public class DeleteEmployee {
	
	public void deleteStudentData() {

		// 1. Session Factory
		SessionFactory factory = HibernateUtility.getSessionFactory();

		// 2. Session From Session Factory
		Session session = factory.openSession();

		// 3. Transaction from session
		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id to Delete  : ");
		int StudentIdUserInput = sc.nextInt();

		Employee st = session.find(Employee.class, StudentIdUserInput);
		
		session.remove(st);
		
		transaction.commit();
		
		session.close();
		

	}

}
