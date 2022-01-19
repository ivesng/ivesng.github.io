package com.lkc.lkc.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity @Setter @Getter
public class Login {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String matricule;
    private String password;
    private String role;
}
