package com.lkc.lkc.entities;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity @Getter @Setter
public class Sous_finance {
    @Id
    @Generated
    private Long id;
    private Long imputation;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date date;
    private String libelle;
    private Long debit;
    private Long credit;
    private Long taux;
    private Long _debit;
    private Long _credit;
    private Long solde;
    private String numero_ecriture;

}
