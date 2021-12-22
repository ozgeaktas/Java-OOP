
public class Student extends User {
	String department;
	String enrolledCourse;
	
	public Student() {
		
	}
	
	public Student(int id,String name,String surname,String department,String enrolledCourse) {
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.department=department;
		this.enrolledCourse=enrolledCourse;
	}

}
