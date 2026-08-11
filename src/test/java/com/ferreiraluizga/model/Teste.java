package com.ferreiraluizga.model;

public class Teste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("Roberto");
        c1.setCpf("12345678900");
        c1.setTelefone("11987654321");
        c1.setEmail("roberto@gmail.com");
        mostrarDados(c1);
    }

    public static void mostrarDados(Cliente cliente) {
        System.out.println("===== Cliente: " + cliente.getNome() + " =====" +
                "\nCPF: " + cliente.getCpf() +
                "\nTelefone: " + cliente.getTelefone() +
                "\nE-Mail: " + cliente.getEmail());
    }
}
