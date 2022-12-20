package com.redesocial.services;

import com.redesocial.models.Usuario;
import com.redesocial.repositories.UsuarioRepository;

import java.util.Scanner;

public class Iniciar {

    public static final String OPCAO_CADASTRAR_MENU_INICIAL = "C";
    public static final String OPCAO_ENTRAR_MENU_INICIAL = "E";
    public static final String OPCAO_FINALIZAR_MENU_INICIAL = "F";

    public static String iniciarPrograma(Scanner scanner){
        String opcaoEscolhida = "";

        System.out.println("Seja bem vindo a rede social. Escolha uma opção: ");
        System.out.println("C - Cadastrar");
        System.out.println("E - Entrar");
        System.out.println("F - Fechar");
        opcaoEscolhida = scanner.nextLine();

        if(!opcaoEscolhida.equalsIgnoreCase(OPCAO_CADASTRAR_MENU_INICIAL) &&
                !opcaoEscolhida.equalsIgnoreCase(OPCAO_ENTRAR_MENU_INICIAL) &&
                !opcaoEscolhida.equalsIgnoreCase(OPCAO_FINALIZAR_MENU_INICIAL)){
            System.out.println("Opção inválida!");
            return iniciarPrograma(scanner);
        }
        return opcaoEscolhida;
    }

    public void executarMenuInicial(Scanner scanner, UsuarioRepository usuarioRepository, String opcaoEscolhida){
        switch (opcaoEscolhida.toUpperCase()){
            case OPCAO_CADASTRAR_MENU_INICIAL:
                Cadastrar cadastrar = new Cadastrar();
                cadastrar.executar(scanner);
                break;
            case OPCAO_ENTRAR_MENU_INICIAL:
                if(!usuarioRepository.pegarUsuarios().isEmpty()){
                    Logar logar = new Logar();
                    MenuUsuario menuUsuario = new MenuUsuario();

                    Usuario usuario = logar.fazerLogin(scanner);
                    if (usuario != null) opcaoEscolhida = menuUsuario.exibirMenu(scanner,usuario);
                }else {
                    System.out.println("Não existe usuário cadastrado. Cadastre um antes de tentar entrar!");
                }
                break;
            case OPCAO_FINALIZAR_MENU_INICIAL:
                System.out.println("Tchau, espero que você volte logo");
                break;
        }
    }
}
