package org.example.echonote.controller;

import lombok.RequiredArgsConstructor;
import org.example.echonote.dto.UserDTO;
import org.example.echonote.dto.request.UserRequest;
import org.example.echonote.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/all-users")
    public List<UserDTO> allUsers(){
        return userService.allUsers();
    }

    @GetMapping("/userByUsername/{username}")
    public UserDTO findUserByUsername(@PathVariable String username){
        return userService.findUserByUsername(username);
    }

    @PutMapping("/update-user")
    public String updateUserInfo(@RequestBody UserRequest userRequest){
        return userService.updateUserInfo(userRequest);
    }

}
