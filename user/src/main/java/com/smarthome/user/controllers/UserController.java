package com.smarthome.user.controllers;

import com.smarthome.user.domain.dto.response.UserBaseResponseDTO;
import com.smarthome.user.domain.dto.response.UserDetailResponseDTO;
import com.smarthome.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public ResponseEntity<List<UserBaseResponseDTO>> getAllUsers()
    {
        List<UserBaseResponseDTO> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDetailResponseDTO> getUserById(@PathVariable Long id)
    {
        UserDetailResponseDTO user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }
}
