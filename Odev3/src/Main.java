
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 =new Student(1,"�zge","akta�","bilgisayar m�hendisli�i","java kamp�");
		Student student2=new Student(2,"irem","baki","mekatronik m�hendisli�i","c# kamp�");
		
		
		Instructor instructor1=new Instructor(1,"engin","demiro�","yaz�l�m e�itmeni");
		Instructor instructor2=new Instructor(2,"murat","ayd�n","nesnelerin interneti e�itmeni");
		
		
		InstructorManager instructorManager=new InstructorManager();
		UserManager userManager=new UserManager();
		StudentManager studentManager=new StudentManager();
		
		User[] users= {student1,student2,instructor1,instructor2};
		userManager.login(users);
		instructorManager.addCourse();
		studentManager.buyCourse(student1);
		
		
		
	}

}
