package com.tech.user.imp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.user.entities.User;
import com.tech.user.exceptions.ResourceNotFoundException;
import com.tech.user.repository.UserRepository;
import com.tech.user.service.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return userRepository.save(user);
	}

	@Override
	public List<User> getallUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		return userRepository.findById(userId).orElseThrow(
				() -> new ResourceNotFoundException("User with given Id is Not Found on Server !! " + userId));
	}
}
