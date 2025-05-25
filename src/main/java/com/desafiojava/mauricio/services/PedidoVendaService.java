package com.desafiojava.mauricio.services;

import com.desafiojava.mauricio.entities.PedidoVenda;
import com.desafiojava.mauricio.entities.StatusPedido;

import java.util.List;

public interface PedidoVendaService {
    // criar dto depois
    public PedidoVendaDTO criarPedido(CriarPedidoInputDTO novoPedido);

    public PedidoVenda buscarPedidoPorId(String idPedido);

    public PedidoVenda atualizarStatusPedido(String idPedido, StatusPedido novoStatus);

    public List<PedidoVenda> listarTodosPedidos(StatusPedido statusFiltro);

    public PedidoVenda cancelarPedido(String idPedido);

    // Listar vendas por cliente e calcular o total da soma de todos os pedidos do cliente com status (PAGO)
    //public List<PedidoVenda> listarVendasPorCliente(String clienteId);
    public ResultadoVendasCliente obterVendasPagasEtotalPorCliente(String clienteId);
    // criar dto depois

    public RelatorioSistemaDTO geraRelatorio();
    // criar dto depois
}
