package com.desafiojava.mauricio.repositories;

import com.desafiojava.mauricio.entities.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
