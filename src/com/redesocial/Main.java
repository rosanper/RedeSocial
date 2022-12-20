package com.redesocial;

import com.redesocial.models.Usuario;
import com.redesocial.repositories.UsuarioRepository;
import com.redesocial.services.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Iniciar iniciar = new Iniciar();
        MenuInicial menuInicial = new MenuInicial();

        UsuarioRepository usuarioRepository = new UsuarioRepository();

        String opcaoEscolhida;

        do {
            opcaoEscolhida = iniciar.executar(scanner);
            menuInicial.executarMenuInicial(scanner,usuarioRepository,opcaoEscolhida);
        }while (!opcaoEscolhida.equalsIgnoreCase(MenuInicial.OPCAO_FINALIZAR_MENU_INICIAL));
    }


}
