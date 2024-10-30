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
}
public  void displayStudent() {
	System.out.println(h);
}

public void deleteStudent() {
	System.out.println("Enter student id:");
	int id=in.nextInt();
	if(h.containsKey(id)) {
		h.remove(id);
	}
}

public void searchStudent() {
	System.out.println("Enter student id:");
	int id=in.nextInt();
	if(h.containsKey(id)) {
		System.out.println(h.get(id));
	}
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
	}
}


}
