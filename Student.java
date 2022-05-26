package orgstudent;



import orgdepartment.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("studentName");
		
	}
	public void studentDept() {
		System.out.println("studentDept");
		
	}
	public void studentid() {
		System.out.println("studentid");
		
	}
	
	
	
	public static void main(String[] args) {
		Student name= new Student();
		name.collagename();
		name.collageCode();
		name.collageRank();
	    name.deptName();
		name.studentDept();
		name.studentid();
		name.studentName();
		
		
	
	}
	
		
	


}
