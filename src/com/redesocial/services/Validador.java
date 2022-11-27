package com.redesocial.services;

import com.redesocial.exceptions.LoginException;
import com.redesocial.exceptions.SenhaException;
import com.redesocial.exceptions.StringInvalidaException;
import com.redesocial.exceptions.UsuarioNaoEncontradoException;
import com.redesocial.models.Usuario;
import com.redesocial.repositories.UsuarioRepository;

public class Validador {

    public void validarVazio(String string){
        if (string.isBlank()) throw new StringInvalidaException("Este campo não pode ser vazio");
    }
    public void validarLoginExistente(String login) throws LoginException {
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        Usuario usuario = usuarioRepository.acharUsuarioPorLogin(login);
        if (usuario != null){
            throw new LoginException("Esse login já existe, você não pode cadastrar esse usuário");
        }
    }

    public void validarSeExisteLogin(Usuario usuario) throws LoginException {
        if (usuario == null){
            throw new UsuarioNaoEncontradoException("Esse login não existe");
        }
    }

    public void validarSenhaExistente(String senha) throws SenhaException {
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        Usuario usuario = usuarioRepository.acharUsuarioPorSenha(senha);
        if (usuario != null){
            throw new SenhaException("Você não pode utilizar esta senha, ela já exsite");
        }
    }

    public boolean validarSenhaCorreta(Usuario usuario, String senha) throws SenhaException{
        boolean ehCorreta = usuario.getSenha().equals(senha);
        if (!ehCorreta) throw new SenhaException("A senha está incorreta!");
        return true;
    }
}
