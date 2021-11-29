package com.springboot.soap.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.soap.api.entity.User;

@Service
public class UserServiceImpl implements UserService {

	//Fake services
	
	List<User> list = List.of(
			new User((long) 1321, "Akshay Kemekar", "8668245518"),
			new User((long) 1421, "Tirupati Kemekar", "8888311300"),
			new User((long) 12521, "Shankar Kemekar", "9921071860")
			);
	
	@Override
	public User getUser(Long userId) {
		return list.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
		
	}

}
