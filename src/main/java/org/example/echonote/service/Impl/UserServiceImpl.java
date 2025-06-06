package org.example.echonote.service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.echonote.dto.UserDTO;
import org.example.echonote.dto.mapper.UserMapper;
import org.example.echonote.dto.request.UserRequest;
import org.example.echonote.model.User;
import org.example.echonote.model.enums.RoleType;
import org.example.echonote.repository.UserRepository;
import org.example.echonote.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserDTO> allUsers() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::toDTO)
                .toList();
    }

    @Override
    public UserDTO findUserByUsername(String username) {
        return userMapper.toDTO(userRepository.findUserByUsername(username));
    }

    @Override
    public void login(String email, String password) {



    }

    @Override
    public void logout() {

    }

    @Override
    public UserDTO registration(UserRequest userRequest) {

        User user = userMapper.toEntity(userRequest);
        user.setRole(RoleType.ROLE_USER);

        return userMapper.toDTO(userRepository.save(user));

    }

    @Override
    public String updateUserInfo(UserRequest userRequest) {
        User user = userRepository.findUserByUsername(userRequest.username());
;

        user.setName(userRequest.name());
        user.setUsername(userRequest.username());
        user.setEmail(userRequest.email());
        user.setPassword(userRequest.password());
        user.setAge(userRequest.age());

        userRepository.save(user);

        return "success";
    }



    /*

        Admins Only

     */
    @Override
    public Optional<UserDTO> findUserById(Long id) {
        return userRepository.findById(id)
                .map(userMapper::toDTO);
    }


    @Override
    public Optional<UserDTO> findUserByEmail(String email) {
        return userRepository.findUserByEmail(email)
                .map(userMapper::toDTO);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
