
public class UserManager {
	public void login(User[] users) {
		for(User user:users) {
		System.out.println(user.name+"isimli kullanýcý sisteme giriþ yaptý.");
		}
		
	}
	public void logout(User[] users) {
		for(User user:users) {
			System.out.println(user.name+"isimli kullanýcý sistemden çýkýþ yaptý.");
			}
		
	}

}
