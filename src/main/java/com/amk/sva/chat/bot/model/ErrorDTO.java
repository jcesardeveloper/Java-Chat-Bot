package com.amk.sva.chat.bot.model;

/**
 * Class for error.
 * @author Julio Cesar Bolaños Palacios
 * @since 03/11/2016
 * @version 1.0
 */
public class ErrorDTO {
	private int statusCode;
	private String status;
	private String message;
	
	
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
