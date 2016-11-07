package com.amk.sva.chat.bot.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Rest controller for pages.
 * @author Julio Cesar Bolaños Palacios
 * @since 03/11/2016
 * @version 1.0
 */
@RestController
public class PagesControllerRs {
	
	private static final Logger log = LoggerFactory.getLogger(PagesControllerRs.class);
	
	
	/**
	 * Handle request to home.
	 * @return
	 */
	@RequestMapping(value="/", method=RequestMethod.GET, produces=MediaType.TEXT_PLAIN_VALUE)
	public String goHome(){
		log.info("Go to home page.");
		return "Amk Chat Bot";
	}
	
	/**
	 * Handle request to privacy page.
	 * @return
	 */
	@RequestMapping(value="/privacy", method=RequestMethod.GET, produces=MediaType.TEXT_PLAIN_VALUE)
	public String goPrivacy(){
		log.info("Go to home privacy page.");
		return "Privacy";
	}
	
	
	/**
	 * Handle request to terms and condition page.
	 * @return
	 */
	@RequestMapping(value="/terms", method=RequestMethod.GET, produces=MediaType.TEXT_PLAIN_VALUE)
	public String goTermsConditions(){
		log.info("Go to Terms and Conditions page.");
		return "TyC";
	}
	
}
