package com.desafiojava.mauricio.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "itemPedido")
public class ItemPedido {
    private Produto produto;
    private int quantidade;
    private Double preco;
}
