package com.redesocial;

import com.redesocial.models.Usuario;
import com.redesocial.services.Cadastrar;
import com.redesocial.services.Menu;
import com.redesocial.services.Iniciar;
import com.redesocial.services.Logar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Iniciar iniciar = new Iniciar();

        String opcaoEscolhida;

        do {
            opcaoEscolhida = iniciar.executar(scanner);
            switch (opcaoEscolhida.toUpperCase()){
                case "C":
                    Cadastrar cadastrar = new Cadastrar();
                    cadastrar.executar(scanner);
                    break;
                case "E":
                    Logar logar = new Logar();
                    Menu menu = new Menu();

                    Usuario usuario = logar.fazerLogin(scanner);
                    if (usuario != null) opcaoEscolhida = menu.exibirMenu(scanner,usuario);
                    break;
                case "F":
                    System.out.println("Tchau, espero que você volte logo");
                    break;
            }
        }while (!opcaoEscolhida.equalsIgnoreCase("F"));
    }


}
