package com.desafiojava.mauricio.repositories;

import com.desafiojava.mauricio.entities.PedidoVenda;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PedidoVendaRepository extends MongoRepository<PedidoVenda, String> {
}
