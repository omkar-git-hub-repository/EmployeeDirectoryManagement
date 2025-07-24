package com.practice.EmployeeDirectorySystem;

import java.util.Scanner;

public class App {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		System.out.println("Employee Directory System !");

		while(true)
		{
			System.out.println("Enter the Choice :"
					+ "\n1. Get Employee Details By ID "
					+ "\n2. Get All Employee Details "
					+ "\n3. Add Employee "
					+ "\n4. Update Employee Data "
					+ "\n5. Delete Employee"
					+ "\n6. Set Employee Documents"
					+ "\n7. Exit ");
					
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
			switch(choice) {
				
			case 1 : 
				GetEmployeeDetails get = new GetEmployeeDetails();
				get.getByID();
				break;
			
			case 2:
				GetEmployeeDetails getAll = new GetEmployeeDetails();
				getAll.getAllStudentDetails();
				break;
			
			case 3 : 
				AddEmployee add = new AddEmployee();
				add.addEmployee();
				break;
				
			case 4 : 
				UpdateEmployeeData update = new UpdateEmployeeData();
				update.updateByID();
				break;
				
			case 5 :
				DeleteEmployee delete =  new DeleteEmployee();
				delete.deleteEmployeeData();
				break;
			case 6 :
				SetEmployeeDoc setDoc = new SetEmployeeDoc();
				setDoc.setDoc();
				break;
		
			default : {
					System.out.println("Enter valid input");
				}
			}
			
		}
        
    }
}
