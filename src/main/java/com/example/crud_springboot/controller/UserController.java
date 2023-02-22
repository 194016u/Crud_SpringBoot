package com.example.crud_springboot.controller;

import com.example.crud_springboot.dto.UserDTO;
import com.example.crud_springboot.service.UserService;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getUser")
    public String getUser(){
        return "virnga u can";
    }
    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }
    @PutMapping("/updateUser")
    public String updateUser(){
        return "updateUser";
    }
    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "deleteUser   ";
    }
}
