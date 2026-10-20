package com.ferreiraluizga.sistemacomercio;

import com.ferreiraluizga.sistemacomercio.model.Cliente;
import com.ferreiraluizga.sistemacomercio.service.ClienteService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class TesteCliente {
    public static void main(String[] args) {

        try (ConfigurableApplicationContext context = SpringApplication.run(SistemacomercioApplication.class, args)) {
            ClienteService service = context.getBean(ClienteService.class);

            Cliente cliente = new Cliente(
                    "Maria Oliveira",
                    "12345678909",
                    "11999999999",
                    "maria@gmail.com"
            );

            Cliente clienteSalvo = service.cadastrar(cliente);

            System.out.println("Cliente cadastrado! " + clienteSalvo);

            System.out.println("\nLISTA DE CLIENTES");

            for (Cliente c : service.listar()) {
                System.out.println(c);
            }
        }

    }
}
