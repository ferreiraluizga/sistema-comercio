package com.ferreiraluizga.model;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Teste_ArrayList {

    public static void main(String[] args) {
        /*
        Exercício de Manipulação Básica:
        Escreva um trecho de código que:
            1. Crie um ArrayList de Strings chamado frutas.
            2. Adicione "Maçã", "Banana" e "Morango".
            3. Insira "Uva" na primeira posição (índice 0).
            4. Substitua "Banana" por "Pêra".
            5. Remova o "Morango".
            6. Imprima o tamanho final da lista.
         */

        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Morango");

        frutas.add(0, "Uva");

        frutas.set(2, "Pêra");

        frutas.remove("Morango");

        System.out.println(frutas.size());

        /*
        Busca e Verificação:
        Crie uma lista de números inteiros com os valores [10, 20, 30, 40, 50]. Escreva um
        código que verifique se o número 30 está na lista. Se estiver, remova-o.
         */
        ArrayList<Integer> numerosInteiros = new ArrayList<>();

        numerosInteiros.add(10);
        numerosInteiros.add(20);
        numerosInteiros.add(30);
        numerosInteiros.add(40);
        numerosInteiros.add(50);

        System.out.println(numerosInteiros);

        if (numerosInteiros.contains(30)) {
            // indexOf -> busca a posição de um elemento no arraylist baseado no conteúdo
            int indice = numerosInteiros.indexOf(30);
            System.out.println("Índice: " + indice + " | Valor: 30");
            numerosInteiros.remove(indice);
        }

        System.out.println(numerosInteiros);

        /*
        6. Desafio: Lista de Objetos:
        Imagine uma classe Produto com os atributos nome (String) e preco (double).
            1. Crie um ArrayList<Produto>.
            2. Adicione 3 produtos à sua escolha.
            3. Percorra a lista usando um laço for-each e imprima apenas o nome dos produtos
            que custam mais de R$ 50,00
         */
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Mouse", "Descrição do Produto 1", new BigDecimal("34.50")));
        produtos.add(new Produto("Papel Sulfite", "Descrição do Produto 2", new BigDecimal("24.80")));
        produtos.add(new Produto("Teclado", "Descrição do Produto 3", new BigDecimal("94.50")));
        produtos.add(new Produto("Lápis", "Descrição do Produto 3", new BigDecimal("4.50")));
        produtos.add(new Produto("Monitor", "Descrição do Produto 3", new BigDecimal("534.50")));

        for (Produto produto : produtos) {
            if (produto.getPreco().compareTo(BigDecimal.valueOf(50)) > 0) {
                System.out.println("Nome: " + produto.getNome());
            }
        }
    }

}

