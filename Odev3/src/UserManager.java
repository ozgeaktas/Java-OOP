
public class UserManager {
	public void login(User[] users) {
		for(User user:users) {
		System.out.println(user.name+"isimli kullan�c� sisteme giri� yapt�.");
		}
		
	}
	public void logout(User[] users) {
		for(User user:users) {
			System.out.println(user.name+"isimli kullan�c� sistemden ��k�� yapt�.");
			}
		
	}

}
