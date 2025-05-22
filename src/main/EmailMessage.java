package main;

import auths.AuthCredentials;
import interfaces.ILogin;
import messages.Message;

public class EmailMessage extends Message {
	private String sourceEmail;
	private String destEmail;

	public EmailMessage(ILogin loginMethod, String sourceEmail, String destEmail, String message) {
		super(loginMethod, message);
		// TODO Auto-generated constructor stub
		this.sourceEmail = sourceEmail;
		this.destEmail = destEmail;
	}

	//Sudah menerapkan Liskov principle, karena subclasss(class ini) dapat menggantikan class parentnya
	//tanpa mengubah kebenaran program
	
	//Sudah melakukan Dependency Inversion priciple, dengan mengubah modul tingkat tinggi, tingkat rendah
	//supaya ketika ingin memanggil send, tidak perlu harus spesifik ke subclass, namun bisa secara general terhadap abstractnya
	@Override
	public void send(String username, String password) {
		// TODO Auto-generated method stub
		boolean isAuth = loginMethod.authenticate(new AuthCredentials(username, password));
		if(isAuth) {
			System.out.println("Email sent from " +sourceEmail+" to " + destEmail+": " + message);
		}else {
			System.out.println("Email authentication failed for user: " + username);
		}
	}

}
