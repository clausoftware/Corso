package users;

public class User {

	private final String accessCode;
	private String username;
	private int role;


	public User() {
		accessCode = "";
	}


	public User(String accessCode) {
		this.accessCode = accessCode;
	}

}
