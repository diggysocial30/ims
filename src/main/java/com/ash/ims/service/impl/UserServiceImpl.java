package com.ash.ims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ash.ims.entity.UserRole;
import com.ash.ims.entity.dto.UserDTO;
import com.ash.ims.model.vo.User;
import com.ash.ims.repository.UserRepository;
import com.ash.ims.service.UserService;

@Service
public class UserServiceImpl implements UserDetailsService,UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDTO findByUserName(String userName) {
		User user=userRepository.findByUserName(userName);
		if(user ==null) {
			return null;
		}
		return UserDTO.builder().userName(user.getUserName()).userRole(user.getUserRole()).build();
	}

	@Override
	public User save(UserDTO userRegistration) {
		User user=userRepository.save(User.builder().userName(userRegistration.getUserName()).password(userRegistration.getPassword()).userRole(UserRole.OPERATOR).build());
	    return user;
	}

	@Override
	public UserDTO findOrCreate(UserDTO userDTO) {
		UserDTO oUserDTO=findByUserName(userDTO.getUserName()) ;
		if(oUserDTO==null) {
			User user=save(userDTO);
			return UserDTO.builder().userName(user.getUserName()).userRole(user.getUserRole()).build();
			
		}
		return oUserDTO;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
