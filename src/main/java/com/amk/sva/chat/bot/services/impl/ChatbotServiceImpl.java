package com.amk.sva.chat.bot.services.impl;

import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.amk.sva.chat.bot.services.IChatbotService;

/**
 * Implementation of interface IChatbotService
 * @author Julio Cesar Bolaños Palacios
 * @since 03/11/2016
 * @version 1.0
 */

@Service
public class ChatbotServiceImpl implements IChatbotService{
	
	private static final Logger log = LoggerFactory.getLogger(ChatbotServiceImpl.class);
	
	public String handleMessage(Map<String, String[]> messageParameters) {
		log.info("------    ");
		log.info("In ChatbotServiceImpl : handleMessage ");
		log.info("Request parameters found: {}", messageParameters.size());
		
		for (Entry<String, String[]> entry : messageParameters.entrySet()){
		    log.info("{} : {}", entry.getKey(), entry.getValue());
		}
		
		
		return "Accept Message Entry";
	}

}
