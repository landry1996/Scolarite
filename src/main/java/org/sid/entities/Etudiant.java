package org.sid.entities;



import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Entity
@Data  @NoArgsConstructor @AllArgsConstructor @ToString
public class Etudiant {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String name;
    private String email;
    private Date dateNaissance;
    private  int score;
}
