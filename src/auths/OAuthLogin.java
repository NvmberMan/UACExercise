package auths;

import interfaces.ILogin;

public class OAuthLogin implements ILogin {
	
	private AuthCredentials credentials;
	

	public OAuthLogin(String token) {
		credentials = new AuthCredentials("" ,token);
	}

	@Override
	public boolean authenticate(AuthCredentials credentials) {
		if(credentials.getSecret().equals(this.credentials.getSecret())) {
			return true;
		}
		return false;
	}
}