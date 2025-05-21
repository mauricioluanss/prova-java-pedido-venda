package com.desafiojava.mauricio.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cliente")
public class Cliente {
    @Id
    private Long id;
    private String nome;
    private String username;
}
