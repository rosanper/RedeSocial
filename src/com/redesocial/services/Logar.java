package com.redesocial.services;

import com.redesocial.exceptions.SenhaException;
import com.redesocial.exceptions.UsuarioNaoEncontradoException;
import com.redesocial.models.Usuario;
import com.redesocial.repositories.UsuarioRepository;

import java.util.Scanner;

public class Logar {
    public Usuario fazerLogin(Scanner scanner){
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        Validador validador = new Validador();

        String login;
        String senha;

        try{
            System.out.println("Login: ");
            login = scanner.nextLine();
            Usuario usuario = usuarioRepository.acharUsuarioPorLogin(login);
            validador.validarSeExisteLogin(usuario);

            System.out.println("Senha: ");
            senha = scanner.nextLine();
            if(validador.validarSenhaCorreta(usuario,senha)) return usuario;

        } catch (UsuarioNaoEncontradoException e){
            System.out.println(e.getMessage());
            if(!continuarNoLogin(scanner)) return null;
            System.out.println("Faça seu Login novamente!");
            return fazerLogin(scanner);

        } catch (SenhaException e){
            System.out.println(e.getMessage());
            if(!continuarNoLogin(scanner)) return null;
            System.out.println("Faça seu Login novamente!");
            return fazerLogin(scanner);
        }
        return null;
    }

    private boolean continuarNoLogin(Scanner scanner){
        System.out.println("Desejá tentar logar novamente? (s/n)");
        String escolha = scanner.nextLine();
        return escolha.equalsIgnoreCase("s");
    }
}
