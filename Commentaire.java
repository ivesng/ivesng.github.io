package com.lkc.lkc.entities;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity @Getter @Setter
public class Commentaire {
    @Id
    @Generated
    private Long id;
    private String body;
    private Long idusers;
}
