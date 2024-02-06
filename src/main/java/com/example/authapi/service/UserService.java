package com.example.authapi.service;

import com.example.authapi.entity.UserEntity;

import java.util.List;

public interface UserService {

    UserEntity saveUser(UserEntity userEntity);

    UserEntity updateUser(UserEntity userEntity);

    List<UserEntity> getAllUser();

    UserEntity getUser(Long userId);

    UserEntity deleteUser(Long userId);

}
