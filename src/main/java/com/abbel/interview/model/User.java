package com.abbel.interview.model;

public class User {

    public User(String pseudo, String email){
        this.id = (long) (Math.random() * 1000000);
        this.pseudo=pseudo;
        this.email=email;
    }

    public Long id;
    public String pseudo;
    public String email;
}
