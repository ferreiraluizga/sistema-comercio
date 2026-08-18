package com.ferreiraluizga.model;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // instanciando objeto da classe Cliente
        Cliente c1 = new Cliente();

        System.out.print("Digite seu Nome: ");
        c1.setNome(scanner.nextLine());

        System.out.print("Digite seu CPF: ");
        c1.setCpf(scanner.nextLine());

        System.out.print("Digite seu Telefone: ");
        c1.setTelefone(scanner.nextLine());

        System.out.print("Digite seu E-mail: ");
        c1.setEmail(scanner.nextLine());

        // instanciando objeto da classe Produto
        Produto p1 = new Produto();

        System.out.print("Digite o nome do produto: ");
        p1.setNome(scanner.nextLine());

        System.out.print("Digite a descrição do produto: ");
        p1.setDescricao(scanner.nextLine());

        System.out.print("Digite o preço do produto: ");
        p1.setPreco(scanner.nextBigDecimal());

        System.out.print("Digite a quantidade em estoque do produto: ");
        p1.setEstoque(scanner.nextInt());

        System.out.println(c1.toString());
        System.out.println(p1.toString());
    }
}
