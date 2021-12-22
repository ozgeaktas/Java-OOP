
public class Instructor extends User {
	String biography;
	
	public Instructor() {
		
	}
	
	public Instructor(int id,String name,String surname,String biography) {
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.biography=biography;
	}

}
