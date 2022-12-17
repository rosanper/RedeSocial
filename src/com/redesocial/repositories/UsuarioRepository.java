package com.redesocial.repositories;

import com.redesocial.Main;
import com.redesocial.models.Usuario;

import java.util.List;

public class UsuarioRepository {

    public List<Usuario> pegarUsuarios(){
        return Main.usuarios;
    }

    public Usuario acharUsuarioPorLogin(String login){
        List<Usuario> usuarios = pegarUsuarios();
        for (Usuario usuario : usuarios) {
            if(usuario.getLogin().equals(login)) return usuario;
        }
        return null;
    }

    public Usuario acharUsuarioPorSenha(String senha){
        List<Usuario> usuarios = pegarUsuarios();
        for (Usuario usuario : usuarios) {
            if(usuario.getSenha().equals(senha)) return usuario;
        }
        return null;
    }

    public void adicionarUsuario(String nome, String login, String senha){
        Usuario usuario = new Usuario(nome, login, senha);
        Main.usuarios.add(usuario);
    }

}
