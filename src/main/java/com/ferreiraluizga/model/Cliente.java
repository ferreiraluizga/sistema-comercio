package com.ferreiraluizga.model;

public class Cliente {

    // atributos da classe
    private Long idCliente;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    // construtor vazio
    public Cliente() {}

    // construtor com parâmetros not null do banco
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // construtor com todos os parâmetros
    public Cliente(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    // getters e setters
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome +
                "\nCPF: " + this.cpf +
                "\nTelefone: " + this.telefone +
                "\nE-mail: " + this.email;
    }

}
