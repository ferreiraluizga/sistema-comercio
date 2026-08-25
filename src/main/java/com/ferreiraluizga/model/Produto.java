package com.ferreiraluizga.model;

import java.math.BigDecimal;

public class Produto {

    // atributos da classe
    private Long idProduto;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private int estoque = 0;

    // construtor vazio
    public Produto() {}

    // construtor com parâmetros not null do banco
    public Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, String descricao, BigDecimal preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    // getters e setters
    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void atualizaEstoque(int quant) {
        if (quant > 0) {
            this.estoque += quant;
        }
    }

    @Override
    public String toString() {
        return "===== Produto: " + this.nome + " =====" +
                "\nDescrição: " + this.descricao +
                "\nPreço: " + this.preco +
                "\nEstoque: " + this.estoque;
    }

}
