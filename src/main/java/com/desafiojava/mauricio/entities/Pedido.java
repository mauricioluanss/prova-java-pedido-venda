package com.desafiojava.mauricio.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "pedido")
public class Pedido {
    @Id
    private Long id;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private String status;
    private LocalDateTime dataPedido;
}
