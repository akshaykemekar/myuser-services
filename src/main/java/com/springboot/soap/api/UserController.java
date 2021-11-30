package com.springboot.soap.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springboot.soap.api.entity.Contact;
import com.springboot.soap.api.entity.User;
import com.springboot.soap.api.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/")
	public String getHelloWorld(){
		return "Hello User";
	}

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		
		User user = userService.getUser(userId);
		
		List contacts = restTemplate.getForObject("http://contact-service-git-akshaykemekar-stage.apps.sandbox.x8i5.p1.openshiftapps.com/contact/user/"+user.getUserId(), List.class);
		
		user.setContacts((java.util.List<Contact>) contacts);
		
		return user;
	}
	
}
