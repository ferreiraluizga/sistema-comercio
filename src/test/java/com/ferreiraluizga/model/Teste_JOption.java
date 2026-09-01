package com.ferreiraluizga.model;

import javax.swing.*;
import java.util.ArrayList;

public class Teste_JOption {

    public static void main(String[] args) {
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        String menu, nome, cpf, telefone, email;
        int quant, op;
        double valor;

        // exemplo menu opções
        menu = "**********************" +
                "\nSistema 2DSM" +
                "\n**********************" +
                "\n1 - Cadastrar \n2 - Listar \n3 - Alterar \n4 - Excluir \n0 - Sair";

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (op) {
                case 1:
                    nome = JOptionPane.showInputDialog("Digite o nome do cliente");
                    cpf = JOptionPane.showInputDialog("Digite o cpf do cliente");
                    telefone = JOptionPane.showInputDialog("Digite o telefone do cliente");
                    email = JOptionPane.showInputDialog("Digite o email do cliente");

                    // adicionando instância de um cliente à lista
                    listaCliente.add(new Cliente(nome, cpf, telefone, email));

                    JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
                    break;
                case 2:
                    // apresentando arraylist
                    JOptionPane.showMessageDialog(null, listaCliente);
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
