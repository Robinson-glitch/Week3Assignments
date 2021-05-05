package student;

import department.Department;

public class Student extends Department {
	
	//studentName(),studentDept(),studentId()
	
	public void studentName() {
		System.out.println("Robinson");
	
	}
	
	public void studentDept() {
		System.out.println("Computersceince");
	}
	
	public void studentID() {
		System.out.println("111");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj1=new Student();
		obj1.collegeCode();
		obj1.collegeName();
		obj1.collegeRank();
		obj1.dept();
		obj1.studentDept();
		obj1.studentName();
		obj1.studentID();
		
		

	}

}
