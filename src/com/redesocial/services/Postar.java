package com.redesocial.services;

import com.redesocial.models.Usuario;
import com.redesocial.repositories.PostRepository;

import java.util.Scanner;

public class Postar {
    public void fazerPostagem(PostRepository postRepository, Scanner scanner, Usuario usuario){

        System.out.println("Digite o texto que vai ser postado: ");
        String conteudo = scanner.nextLine();

        postRepository.adicionarPost(usuario,conteudo);
    }
}
