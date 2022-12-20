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

        UsuarioRepository usuarioRepository = new UsuarioRepository();

        String opcaoEscolhida;

        do {
            opcaoEscolhida = iniciar.iniciarPrograma(scanner);
            iniciar.executarMenuInicial(scanner,usuarioRepository,opcaoEscolhida);
        }while (!opcaoEscolhida.equalsIgnoreCase(Iniciar.OPCAO_FINALIZAR_MENU_INICIAL));
    }


}
