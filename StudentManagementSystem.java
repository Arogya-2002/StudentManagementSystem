package task30102024;

import java.util.Scanner;

public class StudentManagementSystem extends Reception{ 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StudentManagementSystem s = new StudentManagementSystem();
		boolean flag=true;
	
		
		while(flag) {
			System.out.println("1.Adding Student");
			System.out.println("2. Updating Student");
			System.out.println("3. Deleting Student");
			System.out.println("4. Search Student");
			System.out.println("5. Display Student");
			System.out.println("6. Exit");
			
			System.out.println("Enter your operation:");
			int option = in.nextInt();
			
			switch(option) {
			case 1:{
				s.addStudent();
				break;
			}
			case 2:
			{
				s.updateStudent();
				break;
			}
			case 3:
			{
				s.deleteStudent();
				break;
			}
			case 4:
			{
				s.searchStudent();
				break;
			}
			case 5:
			{
				s.displayStudent();
				break;
			}
			case 6:
			{
				flag=false;
				break;
			}
			default:{
				System.out.println("Invalid option entered!");
			}
			}
		}
		in.close();
	}
}

