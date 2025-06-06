package org.example.echonote.controller;

import lombok.RequiredArgsConstructor;
import org.example.echonote.dto.UserDTO;
import org.example.echonote.dto.request.UserRequest;
import org.example.echonote.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    @PostMapping("/login")
    public void login(@RequestBody String email, String password){
        userService.login(email, password);
    }

    @PostMapping("/logout")
    public void logout(){
        userService.logout();
    }

    @PostMapping("/registration")
    public UserDTO registration(UserRequest userRequest){
        return userService.registration(userRequest);
    }
}
