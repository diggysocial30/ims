package com.ash.ims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ash.ims.entity.dto.UserDTO;
import com.ash.ims.service.UserService;

@RestController
@RequestMapping("/api/ims/login")
public class LoginController {

	@Autowired
    private UserService userService;

    @RequestMapping("/access-denied")
    public String accessDenied() {
        return "error/access-denied";
    }

    @GetMapping(value = "/login")
    public String showRegistrationForm(Model model) {
        return "login";
    }

    @PostMapping("/registration")
    public String registerUserAccount(@RequestBody UserDTO userDTO) {
        UserDTO existing = userService.findOrCreate(userDTO);
        userService.save(userDTO);

        return "redirect:/login?success";
    }
}