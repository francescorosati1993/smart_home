package com.smarthome.user.domain.dto.response;

import com.smarthome.user.domain.enums.Role;
import java.time.LocalDate;

public record UserDetailResponseDTO
    (
        Long id,
        String firstName,
        String lastName,
        LocalDate dateOfBirth,
        String email,
        String phone,
        Role role
    )
{}
