package com.ferreiraluizga.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

    // atributos da classe
    private Long idFuncionario;
    private String nome;
    private String cpf;
    private String cargo;
    private BigDecimal salario;
    private LocalDate dataAdmissao;
    private String email;
    private String status = "ATIVO";

    // construtor vazio
    public Funcionario() {}

    // construtor com parâmetros not null do banco
    public Funcionario(String nome, String cpf, BigDecimal salario, LocalDate dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public Funcionario(String nome, String cpf, String cargo, BigDecimal salario, LocalDate dataAdmissao, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.email = email;
    }

    // getters e setters
    public Long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Long idFuncionario) {
        this.idFuncionario = idFuncionario;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "===== Funcionário: " + this.nome + " =====" +
                "\nCPF: " + this.cpf +
                "\nCargo: " + this.cargo +
                "\nData de Admissão: " + this.dataAdmissao +
                "\nE-mail: " + this.email +
                "\nStatus: " + this.status;
    }

}
