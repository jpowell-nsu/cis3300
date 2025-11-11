package login;
 
public class User {
	private String username;
	private String hashedPassword;
	private String name;
	private String email;

	public User(String username, String hashedPassword, String name, String email) {
		this.username = username;
		this.hashedPassword = hashedPassword;
		this.name = name;
		this.email = email;
	}

	public String getUsername() { return username; }
	public String getHashedPassword() { return hashedPassword; }
	public String getName() { return name; }
	public String getEmail() { return email; }

	public void setName(String name) { this.name = name; }
	public void setEmail(String email) { this.email = email; }
}
