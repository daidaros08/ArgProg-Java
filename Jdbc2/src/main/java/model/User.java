package model;

public class User {
	private String username, password;
	
	public User (String username, String password) {
		super();
		this.username=username;
		this.password=password;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	@Override
	public String toString() {
		return this.username + "- password: ******";
	}

}
