package com.redesocial.repositories;

import com.redesocial.Main;
import com.redesocial.models.Usuario;

import java.util.Arrays;

public class UsuarioRepository {

    public Usuario[] pegarUsuarios(){
        Usuario[] usuarios = Main.usuarios;
        return Arrays.copyOf(usuarios,Main.qntUsuarios);
    }

    public Usuario acharUsuarioPorLogin(String login){
        Usuario[] usuarios = pegarUsuarios();
        for (Usuario usuario : usuarios) {
            if(usuario.getLogin().equals(login)) return usuario;
        }
        return null;
    }

    public Usuario acharUsuarioPorSenha(String senha){
        Usuario[] usuarios = pegarUsuarios();
        for (Usuario usuario : usuarios) {
            if(usuario.getSenha().equals(senha)) return usuario;
        }
        return null;
    }

    public void adicionarUsuario(String nome, String login, String senha){
        Main.usuarios[Main.qntUsuarios] = new Usuario(nome,login,senha);
        Main.qntUsuarios++;
    }

}
