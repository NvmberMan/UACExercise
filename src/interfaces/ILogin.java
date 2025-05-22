package interfaces;

import auths.AuthCredentials;

public interface ILogin {
	public boolean authenticate(AuthCredentials credentials);
}
