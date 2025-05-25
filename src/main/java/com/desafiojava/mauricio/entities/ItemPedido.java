package com.desafiojava.mauricio.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "item_pedido")
public class ItemPedido {
    private Produto produto;
    private double valorUnitario;
    private int quantidade;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
