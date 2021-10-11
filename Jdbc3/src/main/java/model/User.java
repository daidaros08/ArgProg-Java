package model;

public class User {
	private String username, password;
	
	public User (String user, String pass) {
		super ();
		this.username= user;
		this.password = pass;
	}
	
	public String getUsername () {
		return this.username;
	}
	
	public String getPassword () {
		return this.password;
	}
	
	@Override
	public String toString() {
		return this.username + " - password: *******";
	}

}
