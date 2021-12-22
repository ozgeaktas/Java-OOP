
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 =new Student(1,"özge","aktaş","bilgisayar mühendisliği","java kampı");
		Student student2=new Student(2,"irem","baki","mekatronik mühendisliği","c# kampı");
		
		
		Instructor instructor1=new Instructor(1,"engin","demiroğ","yazılım eğitmeni");
		Instructor instructor2=new Instructor(2,"murat","aydın","nesnelerin interneti eğitmeni");
		
		
		InstructorManager instructorManager=new InstructorManager();
		UserManager userManager=new UserManager();
		StudentManager studentManager=new StudentManager();
		
		User[] users= {student1,student2,instructor1,instructor2};
		userManager.login(users);
		instructorManager.addCourse();
		studentManager.buyCourse(student1);
		
		
		
	}

}
