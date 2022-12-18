package com.redesocial.services;

import com.redesocial.models.Post;
import com.redesocial.models.Usuario;
import com.redesocial.repositories.PostRepository;
import com.redesocial.repositories.UsuarioRepository;

import java.util.List;

public class TimeLine {
    public void visualizarTimeLineUsuário(PostRepository postRepository, Usuario usuario){
        List<Post> posts = postRepository.pegarPosts(usuario);
        if (posts.size() == 0) {
            System.out.println("Você não fez nenhum post ainda!");
            System.out.println();
        } else {
            for (Post post : posts) {
                System.out.println(post);
            }
        }
    }

    public void visualizarTimeLineRedeSocial(PostRepository postRepository, UsuarioRepository usuarioRepository){
        List<Usuario> usuarios = usuarioRepository.pegarUsuarios();
        for (Usuario usuario : usuarios) {
            List<Post> posts = postRepository.pegarPosts(usuario);
            System.out.println("- " + usuario.getNome() + " (" + usuario.getLogin() + "):" );
            System.out.println();
            for (Post post : posts) {
                System.out.println(post);
            }
            System.out.println("------------------------------------------------");
        }
    }
}
