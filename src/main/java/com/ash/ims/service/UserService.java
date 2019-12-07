package com.ash.ims.service;

import com.ash.ims.entity.dto.UserDTO;
import com.ash.ims.model.vo.User;

public interface UserService  {

    UserDTO findByUserName(String userName);
    User save(UserDTO userDTO);
	UserDTO findOrCreate(UserDTO userDTO);
}