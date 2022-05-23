package com.abbel.interview.service;

import java.util.List;

import com.abbel.interview.dto.UserDTO;
import com.abbel.interview.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abbel.interview.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository UserRepository;


    public User getUser(){
        return new User("testeur","testeur@abbl.test");
    }

    public List<User> getListUser(){
        return UserRepository.getListUser();
    }

    public User findUserById(Long id){
        return UserRepository.findUserById(id);
    }

    public User createUser(UserDTO userdto){
        return UserRepository.createUser(userdto);
    }

    public User  deleteUser(Long id){
        return UserRepository.deleteUser(id);
    }
}