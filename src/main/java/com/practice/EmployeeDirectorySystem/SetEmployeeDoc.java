package com.practice.EmployeeDirectorySystem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import employee.Entity.Employee;
import employee.Entity.EmployeeDocuments;
import employee.Utility.HibernateUtility;

public class SetEmployeeDoc {

    public void setDoc() {

        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();


        // Create EmployeeDoc object
        EmployeeDocuments employeeDoc = new EmployeeDocuments();

        employeeDoc.setAAdharNo("1234-5678-9012");
        employeeDoc.setPanNo("ABCDE1234F");

        // Create Employee object
        Employee employee = new Employee();
        
        employee.setName("John Doe");
        employee.setDesignation("Software Engineer");
        employee.setDepartment("IT");
        employee.setSalary(60000.00);
     
        // Set EmployeeDoc to Employee
        employee.setEmployeeDoc(employeeDoc);

        session.persist(employee);
        transaction.commit();
        session.close();
    }
}
