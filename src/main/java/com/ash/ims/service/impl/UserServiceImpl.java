package com.ash.ims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ash.ims.entity.UserRole;
import com.ash.ims.entity.dto.UserDTO;
import com.ash.ims.model.vo.User;
import com.ash.ims.repository.UserRepository;
import com.ash.ims.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User save(UserDTO userRegistrationDto) {
		User user=userRepository.save(User.builder().email(userRegistrationDto.getEmail()).password(userRegistrationDto.getPassword()).userRole(UserRole.OPERATOR).build());
	    return user;
	}

}
