package com.lkc.lkc.entities;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity @Getter @Setter
public class Presence {
    @Id @Generated
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date heure_arrive;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date heure_sortie;
    private Long idusers;


}
