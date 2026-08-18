package com.ferreiraluizga.model;

import java.math.BigDecimal;

public class Produto {

    // atributos da classe
    private Long idProduto;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private int estoque = 0;

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

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "\n===== Produto: " + this.nome + " =====" +
                "\nDescrição: " + this.descricao +
                "\nPreço: " + this.preco +
                "\nEstoque: " + this.estoque;
    }

}
