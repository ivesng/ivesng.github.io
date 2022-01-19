package com.lkc.lkc.entities;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Data
@Entity @Getter @Setter
public class Users {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String postNom;
    private String preNom;
    private String matricule;
    private String departement;
    private String category;
    private String fonction;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateNaiss;
    private int age;
    private String dateEngagement;
    private String typeContrat;
    private int anciennete;
    private String lieuAffectation;
    private Long jourCongeAPayer;
    private String departConge;
    private String retourConge;
    private Long jourCongeAValoir;
    private Long jourConge;
    private Long soldeConge;
    private String epouse;
    private int enfants;
    private Long status;
    private String sexe;

   /*********pour savoir si un agent a un compte ou pas*********************/
    private String position;
}
