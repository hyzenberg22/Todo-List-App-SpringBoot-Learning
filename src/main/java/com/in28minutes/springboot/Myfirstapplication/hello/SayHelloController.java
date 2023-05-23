package com.in28minutes.springboot.Myfirstapplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


// when someone says hello return the function 
//it using the port http://localhost:8080/say-hello


@Controller //it sends the info to the spring bean 
public class SayHelloController {
	
	@RequestMapping("say-hello") //it map one specific url to the function
	@ResponseBody //by default spring dosn't return the string, it sends as it is to browser
	public String sayHello() {
		return "Hello shbhajit in the first web application";
	}
	
	//by default spring dosn't return the html page we use Jsp to make one 
	@RequestMapping("say-hello-jsp")
	public String sayhelloJsp() {
		return "sayHello";
	}
}
