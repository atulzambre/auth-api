package com.example.authapi.service.impl;

import com.example.authapi.entity.UserEntity;
import com.example.authapi.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return null;
    }

    @Override
    public UserEntity updateUser(UserEntity userEntity) {
        return null;
    }

    @Override
    public List<UserEntity> getAllUser() {
        return null;
    }

    @Override
    public UserEntity getUser(Long userId) {
        return null;
    }

    @Override
    public UserEntity deleteUser(Long userId) {
        return null;
    }
}
