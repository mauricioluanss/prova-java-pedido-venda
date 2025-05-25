package com.desafiojava.mauricio.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "pedido_venda")
public class PedidoVenda {
    @Id
    private String id;
    private List<ItemPedido> itensPedido;
    private double valorPedido;
    private Cliente cliente;
    private StatusPedido statusPedido;
    private LocalDateTime dataPedido;
    private LocalDateTime dataUltimaAlteracao;
    private String usuarioUltimaAlteracao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDateTime getDataUltimaAlteracao() {
        return dataUltimaAlteracao;
    }

    public void setDataUltimaAlteracao(LocalDateTime dataUltimaAlteracao) {
        this.dataUltimaAlteracao = dataUltimaAlteracao;
    }

    public String getUsuarioUltimaAlteracao() {
        return usuarioUltimaAlteracao;
    }

    public void setUsuarioUltimaAlteracao(String usuarioUltimaAlteracao) {
        this.usuarioUltimaAlteracao = usuarioUltimaAlteracao;
    }
}
