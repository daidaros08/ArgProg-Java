package apis;

public class User {
	private String username;
	private String password;
	
	public User (String user, String pass) {
		this.username=user;
		this.password=pass;
	}
	
	public String getUsername () {
		return this.username;
	}
	
	public String getPassword () {
		return this.password;
	}
	
	public String toString() {
		return "[Username: "+ this.getUsername()+", Password: "+ this.getPassword()+"]";
	}
}
