package com.in28minutes.springboot.Myfirstapplication.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

//we can use the model map to send a particular http request to the site 
// We can set different logging levels inside the applications

@Controller
@SessionAttributes("name") //all attributes in the name are available in the model
public class LoginController {
	//Login Controller 
	
	//authentication of the name and pass word and using a constructor injection 
	private AuthenticationService authenticationService;
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}
	//Get method when someone hit the url
	@RequestMapping(value="user-login", method = RequestMethod.GET)
	public String gotoLoginpage() {
		return "userLogin";
	}
	//Post method when someone actually submit the form
	//now we have a name and password as a form data we have to show it on welcome page 
	//using the requestpram and modelmap & model view controller pattern
	@RequestMapping(value = "user-login", method = RequestMethod.POST)
	public String gotoWelcomepage(@RequestParam String username,
			@RequestParam String password, ModelMap map) {
		if(authenticationService.authenticate(username, password)) {
			map.put("name", username);
			map.put("password", password);
			return "welcome";
		}
		map.put("errorMessage", "Invalid Crediancials Please try again..!");
		return "userLogin";
	}
}
