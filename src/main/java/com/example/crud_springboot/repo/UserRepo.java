package com.example.crud_springboot.repo;

import com.example.crud_springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
