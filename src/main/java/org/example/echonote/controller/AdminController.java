package org.example.echonote.controller;

import lombok.RequiredArgsConstructor;
import org.example.echonote.dto.UserDTO;
import org.example.echonote.model.User;
import org.example.echonote.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    private final UserService userService;

    @GetMapping("/userById/{id}")
    public Optional<UserDTO> findUserById(@PathVariable Long id){
        return userService.findUserById(id);
    }

    @GetMapping("/userByEmail/{email}")
    public Optional<UserDTO> findUserByEmail(@PathVariable String email){
        return userService.findUserByEmail(email);
    }

    @PostMapping("/create-user")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

}
