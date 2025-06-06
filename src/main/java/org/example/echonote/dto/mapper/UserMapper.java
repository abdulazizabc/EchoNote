package org.example.echonote.dto.mapper;

import org.example.echonote.dto.UserDTO;
import org.example.echonote.dto.request.UserRequest;
import org.example.echonote.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserMapper {

    public UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();

        userDTO.setName(user.getName());
        userDTO.setUsername(user.getUsername());
        userDTO.setEmail(user.getEmail());
        userDTO.setRole(user.getRole());
        userDTO.setAge(user.getAge());

        return userDTO;
    }

    public User toEntity(UserRequest userRequest) {
        User user = new User();

        user.setName(userRequest.name());
        user.setUsername(userRequest.username());
        user.setEmail(userRequest.email());
        user.setPassword(userRequest.password());
        user.setAge(userRequest.age());

        return user;
    }

}
