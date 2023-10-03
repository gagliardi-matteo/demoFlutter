package com.demoflutter.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="User_App")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name= "user_name")
    @JoinColumn(nullable=false)
    String name;

    @Column(name= "user_lastname")
    @JoinColumn(nullable=false)
    String lastName;

    @Column(name= "user_email")
    @JoinColumn(nullable=false)
    String email;

    @Column(name= "user_code")
    @JoinColumn(nullable=false)
    String code;

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastname(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return this.email;
    }

    public void setemail(String email){
        this.email = email;
    }

    public String getCode(){
        return this.code;
    }

    public void setCode(String code){
        this.code = code;
    }


}
