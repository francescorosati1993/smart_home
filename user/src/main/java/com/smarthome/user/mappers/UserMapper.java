package com.smarthome.user.mappers;

import com.smarthome.user.domain.dto.response.UserBaseResponseDTO;
import com.smarthome.user.domain.dto.response.UserDetailResponseDTO;
import com.smarthome.user.domain.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper
{
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserBaseResponseDTO userToUserBaseResponseDTO(User user);

    UserDetailResponseDTO userToUserDetailResponseDTO(User user);
}

