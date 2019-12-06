package com.ash.ims.service;

import com.ash.ims.entity.dto.UserDTO;
import com.ash.ims.model.vo.User;

public interface UserService  {

    User findByEmail(String email);
    User save(UserDTO userRegistrationDto);
}