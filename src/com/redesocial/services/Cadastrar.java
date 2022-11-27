package com.redesocial.services;

import com.redesocial.exceptions.LoginException;
import com.redesocial.exceptions.SenhaException;
import com.redesocial.exceptions.StringInvalidaException;
import com.redesocial.repositories.UsuarioRepository;

import java.util.Scanner;

public class Cadastrar {
    public void executar(Scanner scanner){
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        Validador validador = new Validador();

        String nome;
        String login;
        String senha;

        try{
            System.out.println("Digite o seu nome: ");
            nome = scanner.nextLine();
            validarNome(validador,nome);
            System.out.println("Digite o seu login: ");
            login = scanner.nextLine();
            validarLogin(validador,login);
            System.out.println("Digite o seu senha: ");
            senha = scanner.nextLine();
            validarSenha(validador, senha);

            usuarioRepository.adicionarUsuario(nome,login,senha);
            System.out.println("Usuário cadastrado com sucesso!!!");
            System.out.println();

        }catch (StringInvalidaException e){
            System.out.println(e.getMessage());
            executar(scanner);
        } catch (LoginException e){
            System.out.println(e.getMessage());
            executar(scanner);
        } catch (SenhaException e){
            System.out.println(e.getMessage());
            executar(scanner);
        }
    }

    private void validarNome(Validador validador, String nome){
        validador.validarVazio(nome);
    }
    private void validarLogin(Validador validador, String login){
        validador.validarVazio(login);
        validador.validarLoginExistente(login);
    }
    private void validarSenha(Validador validador, String senha){
        validador.validarVazio(senha);
        validador.validarSenhaExistente(senha);
    }

}
