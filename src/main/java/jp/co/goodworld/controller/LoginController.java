package jp.co.goodworld.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.goodworld.model.LoginForm;
import jp.co.goodworld.model.UserInfo;
import jp.co.goodworld.service.LoginService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);


	@Autowired
	LoginService loginService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(method=RequestMethod.GET)
	public String login() {
		logger.debug("requesting login");
		return "login";
	}

	@ModelAttribute
	public LoginForm setupForm(){
		return new LoginForm();
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView doLogin(LoginForm loginForm, BindingResult bindingResult,
								HttpServletRequest request, HttpServletResponse response) {
		logger.debug("dologin");
		ModelAndView modelAndView = new ModelAndView();

		try {
			UserInfo userInfo = new UserInfo();
			userInfo = loginService.getUserInfo(loginForm.getUserId(), loginForm.getPassWd());
			modelAndView.setViewName("YZ/loginSuccess");
			modelAndView.addObject("loginUser", userInfo);
			logger.info("requesting home");
		} catch (EmptyResultDataAccessException e) {
			bindingResult.reject("error.login.user");
			modelAndView.getModel().putAll(bindingResult.getModel());
		}
		return modelAndView;
	}

}

