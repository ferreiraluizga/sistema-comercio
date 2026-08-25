package com.ferreiraluizga.model;

import javax.swing.*;

public class Teste_Cliente {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Gabriel Ferreira", "12345678900", "11987654321", "gabriel@email.com");

        // exibição de dados
        JOptionPane.showMessageDialog(null, c1);
    }

}
