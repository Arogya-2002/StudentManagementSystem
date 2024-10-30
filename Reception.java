package task30102024;

import java.util.HashMap;
import java.util.Scanner;

public class Reception {
	static int id=0;
	
HashMap<Integer,Student> h= new HashMap<Integer,Student>(); 
Scanner in = new Scanner(System.in);

public void addStudent() {
	id++;
	System.out.println("Enter Name of the Student");
	String name=in.nextLine();
	System.out.println("Enter age:");
	int age = in.nextInt();
	System.out.println("Enter Grade");
	String grade=in.nextLine();
	grade=in.nextLine();
	h.put(id,new Student(id,name,age,grade));
	System.out.println("Student added.....");
	lines();
}
public  void displayStudent() {
	if(!h.isEmpty()) {
	System.out.println(h);
	lines();
}
	else {
		System.out.println("no data found");
	}
}
public void deleteStudent() {
	System.out.println("Enter student id:");
	int id=in.nextInt();
	if(h.containsKey(id)) {
		System.out.println("enter 'y' to delete the data and 'n' to cancell deletion:");
		String ch=(""+in.next().charAt(0)).toLowerCase();
		if(ch.equals("y")) {
		h.remove(id);
		System.out.println("Data deleted");
		}
		else {
			System.out.println("Data retained");
		}
	}
	else {
		invalid();
	}
	in.close();
	lines();
}

public void searchStudent() {
	System.out.println("Enter student id:");
	int id=in.nextInt();
	if(h.containsKey(id)) {
		System.out.println(h.get(id));
	}
	else {
		invalid();
	}
	lines();
}

public void updateStudent() {
	System.out.println("Enter student id:");
	int id=in.nextInt();
	if(h.containsKey(id)) {
		System.out.println("Enter Name of the Student");
		String name=in.nextLine();
		name=in.nextLine();
		System.out.println("Enter age:");
		int age = in.nextInt();
		System.out.println("Enter Grade");
		String grade=in.nextLine();
		grade=in.nextLine();
		h.remove(id);
		h.put(id, new Student(id,name,age,grade));
		System.out.println("Data updated");
	}
	else {
		invalid();
	}
	lines();
}

public void  invalid() {
	System.out.println("Inavalid id");
	lines();
}

public void lines() {
	System.out.println("========================================");
}
}
