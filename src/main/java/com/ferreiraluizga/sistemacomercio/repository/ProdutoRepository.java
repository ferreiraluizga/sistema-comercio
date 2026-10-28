package com.ferreiraluizga.sistemacomercio.repository;

import com.ferreiraluizga.sistemacomercio.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
