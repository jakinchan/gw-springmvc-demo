package jp.co.goodworld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MenuController {

	private static final Logger logger = LoggerFactory.getLogger(MenuController.class);

	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value="/YZ/menu", method=RequestMethod.GET)
	public String menu() {
	    	logger.info("requesting menu");
		return "YZ/menu";
	}

	@RequestMapping(value="/YZ/menu.do", method=RequestMethod.POST)
	public String doMenu() {
		logger.info("requesting doMenu");
		return "YZ/member";
	}


}

