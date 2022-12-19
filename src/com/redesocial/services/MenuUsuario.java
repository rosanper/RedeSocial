package com.redesocial.services;

import com.redesocial.models.Usuario;
import com.redesocial.repositories.PostRepository;
import com.redesocial.repositories.UsuarioRepository;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuUsuario {

    public String exibirMenu(Scanner scanner, Usuario usuario){
        PostRepository postRepository = new PostRepository();
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        TimeLine timeLine = new TimeLine();
        Postar postar = new Postar();

        int escolha;

        System.out.println();
        System.out.println("Seja bem vindo " + usuario.getNome());
        System.out.println();

        try{
            do {
                System.out.println("escolha o que você quer fazer: ");
                System.out.println("1 - Postar");
                System.out.println("2 - Ver sua Timeline");
                System.out.println("3 - Ver Timeline dos usuários da Rede Social");
                System.out.println("4 - Sair");
                escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha){
                    case 1:
                        System.out.println("Você vai fazer uma postagem:");
                        postar.fazerPostagem(postRepository, scanner,usuario);
                        System.out.println();
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Você escolheu ver sua Timeline");
                        timeLine.visualizarTimeLineUsuário(postRepository,usuario);
                        System.out.println();
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Você escolheu ver a Timeline de todos os usuarios da Rede Social");
                        timeLine.visualizarTimeLineRedeSocial(postRepository, usuarioRepository);
                        System.out.println();
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Você está saindo da sua conta!");
                        System.out.println();
                        System.out.println();
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        System.out.println();
                }
            }while (escolha != 4);
            return "S";
        } catch (InputMismatchException e){
            System.out.println("Entrada inválida!");
            scanner.nextLine();
            return exibirMenu(scanner, usuario);
        }
    }


}
