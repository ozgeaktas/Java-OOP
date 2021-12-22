
public class InstructorManager extends UserManager {
	public void addStudent(User user) {
		System.out.println(user.name+"isimli öðrenci eklendi.");
	}
	public void addMultiple(User[] users) {
		for(User user:users) {
			addStudent(user);
		}
	}
	public void addCourse() {
		System.out.println("kurs eklendi.");
		
	}
	public void updateCourse() {
		System.out.println("kurs güncellendi.");
	}
	public void deleteCourse() {
		System.out.println("kurs silindi.");
		
	}

}
