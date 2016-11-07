package com.amk.sva.chat.bot.ws;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amk.sva.chat.bot.services.IChatbotService;

/**
 * Rest controller for chat bot.
 * @author Julio Cesar Bolaños Palacios
 * @since 03/11/2016
 * @version 1.0
 */
@RestController
public class ChabotControllerRs {
	
	private static final Logger log = LoggerFactory.getLogger(ChabotControllerRs.class);
	
	@Autowired
	private IChatbotService chatbotService;
	
	@RequestMapping(value="/chat", method=RequestMethod.GET, produces=MediaType.TEXT_PLAIN_VALUE)
	public String handleMessage(HttpServletRequest request){
		log.info("----- ");
		log.info("In ChabotRs : handleMessage ");
		log.info("Handle incoming message.");
		
		return chatbotService.handleMessage(request.getParameterMap());
	}

	
	
}
