package messages;

import interfaces.ILogin;


public abstract class Message {
	protected ILogin loginMethod;
	protected String message;
	
	
	public Message(ILogin loginMethod, String message) {
		this.loginMethod = loginMethod;
		this.message = message;
	}
	
	public abstract void send(String username, String password);
}
