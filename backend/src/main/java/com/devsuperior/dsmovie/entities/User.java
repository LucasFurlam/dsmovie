package com.devsuperior.dsmovie.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
}
