package com.github.danielcosta12.produtosapi.repository;

import com.github.danielcosta12.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
