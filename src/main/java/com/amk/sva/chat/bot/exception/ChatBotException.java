package com.amk.sva.chat.bot.exception;

/**
 * Custom exception.
 * @author Julio Cesar Bolaños Palacios
 * @since 03/11/2016
 * @version 1.0
 */
public class ChatBotException extends Exception {

	
	private static final long serialVersionUID = -4983040257392299679L;
	
	private String message;
	
	public ChatBotException(){
		super();
	}
	
	public ChatBotException(String message){
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
