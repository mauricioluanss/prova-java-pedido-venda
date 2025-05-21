package com.desafiojava.mauricio.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "produto")
public class Produto {
    @Id
    private Long id;
    private String produto;
    private Double preco;
    private int quantidade; //?
}
