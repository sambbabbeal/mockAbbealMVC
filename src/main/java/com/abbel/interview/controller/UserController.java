package com.abbel.interview.controller;

import com.abbel.interview.service.UserService;

import java.util.List;

import com.abbel.interview.dto.UserDTO;
import com.abbel.interview.model.User;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    // TODO : Recup d'un user par ID
   /* @GetMapping("/")
    public User getUser(){
        return this.userService.getUser();
    }*/

    // TODO : Recup de la liste de tous les users
    @GetMapping("/")
    public List<User> getListUser(){
        return this.userService.getListUser();
    }

    // TODO : Créer un utilisateur (prendre UserDTO en entrée et renvoyer le user créé avec son ID) 
    @PostMapping("/")
    public User CreateUser(@RequestBody UserDTO uDto){
        return this.userService.createUser(uDto);
    }
    // TODO : Delete d'un user par id

    @GetMapping("/{id}")
    public User findUserById(@PathVariable Long id){
        return this.userService.findUserById(id);
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable Long id){
        return this.userService.deleteUser(id);
    }
    
}
