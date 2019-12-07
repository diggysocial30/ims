package com.ash.ims.entity.dto;

import com.ash.ims.entity.UserRole;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDTO {

    private String password;

    private String confirmPassword;

    private String userName;
    
    @Builder.Default
    private UserRole userRole=UserRole.VIEWER;

   
}