package auths;

import interfaces.ILogin;

public class BasicLogin implements ILogin {
	
	private AuthCredentials credentials;

	@Override
	public boolean authenticate(AuthCredentials credentials) {
		if(credentials.getUsername() == this.credentials.getUsername() && credentials.getSecret() == this.credentials.getSecret()) {
			return true;
		}
		
		return false;
	}

	public BasicLogin(String username, String password) {
		super();
		credentials = new AuthCredentials(username, password);
	}
}
