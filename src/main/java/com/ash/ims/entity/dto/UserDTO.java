package com.ash.ims.entity.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDTO {

    private String username;

    private String password;

    private String confirmPassword;

    private String email;

   
}