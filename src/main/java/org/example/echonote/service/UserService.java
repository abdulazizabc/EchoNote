package org.example.echonote.service;

import org.example.echonote.dto.UserDTO;
import org.example.echonote.dto.request.UserRequest;
import org.example.echonote.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UserService {

    //Available for everyone
    List<UserDTO> allUsers();
    UserDTO findUserByUsername(String username);
    String updateUserInfo(UserRequest userRequest);

    //Auth only
    void login(String email, String password);
    void logout();
    UserDTO registration(UserRequest userRequest);

    // Admins only
    Optional<UserDTO> findUserById(Long id);
    Optional<UserDTO> findUserByEmail(String email);
    User createUser(User user);

}
