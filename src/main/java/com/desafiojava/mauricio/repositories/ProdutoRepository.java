package com.desafiojava.mauricio.repositories;

import com.desafiojava.mauricio.entities.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
}
