package com.example.crud_springboot.controller;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "virnga u can";
    }
    @PostMapping("/saveUser")
    public String saveUser(){
        return "saveUser";
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
