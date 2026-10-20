package com.ferreiraluizga.sistemacomercio.repository;

import com.ferreiraluizga.sistemacomercio.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
