package com.amk.sva.chat.bot.services;

import java.util.Map;

/**
 * Service for chat bot
 * @author Julio Cesar Bolaños Palacios
 * @since 03/11/2016
 * @version 1.0
 */
public interface IChatbotService {
	
	/**
	 * Handle message entry
	 * @param messageParameters
	 * @return
	 */
	public String handleMessage(Map<String,String[]> messageParameters);
}
