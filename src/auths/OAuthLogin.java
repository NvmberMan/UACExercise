package auths;

import interfaces.ILogin;

public class OAuthLogin implements ILogin {
	
	private String token;
	

	public OAuthLogin(String token) {
		this.token = token;
	}

	@Override
	public boolean authenticate(AuthCredentials credentials) {
		if(credentials.getSecret().equals(this.token)) {
			return true;
		}
		return false;
	}
}