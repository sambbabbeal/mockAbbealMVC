package com.abbel.interview.repository;

import java.util.ArrayList;
import java.util.List;

import com.abbel.interview.dto.UserDTO;
import com.abbel.interview.model.User;

import org.springframework.stereotype.Repository;
import org.webjars.NotFoundException;

@Repository
public class UserRepository {

    private static List<User> userList = new ArrayList<>();
    public long userIdChoose = 1L;


    public List<User> getListUser(){
        return userList;
    }
    /** Cherche un user dans la list, renvoyer une 404 si non présent (Utiliser l'exception NotFount de spring) */
    
    public User findUserById(Long userId){
        for(User u: userList){
            if (u.id.equals(userId)){
                return u;
            }
        }
        throw new NotFoundException("Cette utilisateur n'existe pas");
    }

    /**
     * 1- Créer un id unique
     * 2- Créer le user a partir du dto 
     * 3- Le rajouter dans la liste et le renvoyer 
     */
    public User createUser(UserDTO userDTO){
        User newUser = new User(userDTO.pseudo, userDTO.email);
        userList.add(newUser);
        return newUser;
    }

    /** Supprimer le user en fonction de son ID */
    public User deleteUser(Long userId){
        for(User u: userList){
            if (u.id.equals(userId)){
                userList.remove(u);
                return u;
            }
        }
        return null;
    }
 }