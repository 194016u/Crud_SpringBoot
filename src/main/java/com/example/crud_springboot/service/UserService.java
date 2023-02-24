package com.example.crud_springboot.service;

import com.example.crud_springboot.dto.UserDTO;
import com.example.crud_springboot.entity.User;
import com.example.crud_springboot.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }
    public List<UserDTO> getAllUsers(){
        List<User>userList=userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDTO>>(){}.getType());
    }
    public UserDTO updateUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO,User.class));
        return userDTO;
    }
    public boolean deleteUser(UserDTO userDTO){
        userRepo.delete(modelMapper.map(userDTO,User.class));
        return true;
    }
}

