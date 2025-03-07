package com.smarthome.user.services;

import com.smarthome.user.domain.dto.response.UserBaseResponseDTO;
import com.smarthome.user.domain.dto.response.UserDetailResponseDTO;
import com.smarthome.user.mappers.UserMapper;
import com.smarthome.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public List<UserBaseResponseDTO> getAllUsers()
    {
        return userRepository.findAll()
                             .stream()
                             .map(userMapper::userToUserBaseResponseDTO)
                             .toList();
    }

    public UserDetailResponseDTO getUserById(Long id)
    {
        return userRepository.findById(id)
                             .map(userMapper::userToUserDetailResponseDTO)
                             .orElseThrow(() -> new RuntimeException("User not found"));
    }

}
