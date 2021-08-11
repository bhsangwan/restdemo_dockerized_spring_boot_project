package com.myapp.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	List<User> users = null;

	@GetMapping("/users")
	public List<User> getAllUsers(){
		users = new ArrayList<User>();
		users.add(new User("Hari", "hari@gmail.com"));
		users.add(new User("Reema","reema@yahoo.com"));
		return users;
	}
	
}
