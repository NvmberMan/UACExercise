package auths;

import interfaces.ILogin;

public class BasicLogin implements ILogin {
	
	private AuthCredentials credentials;

	//  -Sudah menerapkan single responsibilty, dimana basiclogin hanya melakukan tugas untuk basic login
	//  -Sudah menerapkan open closed, dimana ketika ingin menambahkan 
	//   fitur baru cukup membuat class baru dengan implemen ILogin, tanpa mengubah kode yang lama
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
