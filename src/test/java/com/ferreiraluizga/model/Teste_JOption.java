package com.ferreiraluizga.model;

import javax.swing.*;

public class Teste_JOption {

    public static void main(String[] args) {
        String menu, nome;
        int quant, op;
        double valor;

        /*
        // ler string
        nome = JOptionPane.showInputDialog("Digite o nome");

        // ler inteiro
        quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));

        // ler double
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço"));

        // mostrar informações
        JOptionPane.showMessageDialog(null, nome +
                "\nQuantidade: " + quant +
                "\nR$ " + valor);

        // exemplo formatando String
        String teste = String.format("Produto: %s \nQuantidade: %d \nPreço: R$ %.2f", nome, quant, valor);
        JOptionPane.showMessageDialog(null, teste);
        */

        // exemplo menu opções
        menu = "**********************" +
                "\nSistema 2DSM" +
                "\n**********************" +
                "\n1 - Cadastrar \n2 - Listar \n3 - Alterar \n4 - Excluir \n0 - Sair";

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Você escolheu cadastrar");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Você escolheu listar");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Você escolheu alterar");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Você escolheu excluir");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Você escolheu sair");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Você escolheu uma opção inválida");
                    break;
            }
        } while (op != 0);
    }

}
