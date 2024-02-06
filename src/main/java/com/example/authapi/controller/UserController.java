package com.example.authapi.controller;

import com.example.authapi.entity.UserEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @PostMapping("users")
    public ResponseEntity<UserEntity> saveUser(@RequestBody UserEntity userEntity) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PatchMapping("users")
    public ResponseEntity<UserEntity> updateUser(@RequestBody UserEntity userEntity) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("users")
    public ResponseEntity<UserEntity> getAllUsers() {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("users/{userId}")
    public ResponseEntity<UserEntity> getUsers(@PathVariable("userId") Long userId) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("users/{userId}")
    public ResponseEntity<UserEntity> deleteUser(@PathVariable("userId") Long userId) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
