package com.redesocial.services;

import java.util.Scanner;

public class Iniciar {
    public static String executar(Scanner scanner){
        String opcaoEscolhida = "";

        System.out.println("Seja bem vindo a rede social. Escolha uma opção: ");
        System.out.println("C - Cadastrar");
        System.out.println("E - Entrar");
        System.out.println("F - Fechar");
        opcaoEscolhida = scanner.nextLine();

        if(!opcaoEscolhida.equalsIgnoreCase("c") && !opcaoEscolhida.equalsIgnoreCase("e") &&
                !opcaoEscolhida.equalsIgnoreCase("f")){
            System.out.println("Opção inválida!");
            return executar(scanner);
        }
        return opcaoEscolhida;
    }
}
