package auths;

public class AuthCredentials {
	private String username;
	private String secret;
	
	
	
	public AuthCredentials(String username, String secret) {
		super();
		this.username = username;
		this.secret = secret;
	}
	
	public String getUsername() {
		return username;
	}

	public String getSecret() {
		return secret;
	}
	
}
