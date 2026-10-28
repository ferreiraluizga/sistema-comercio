package com.ferreiraluizga.sistemacomercio.service;

import com.ferreiraluizga.sistemacomercio.model.Produto;
import com.ferreiraluizga.sistemacomercio.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> listar() {
        return repository.findAll();
    }

    public Produto cadastrar(Produto produto) {
        return repository.save(produto);
    }

}
