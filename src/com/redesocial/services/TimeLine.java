package com.redesocial.services;

import com.redesocial.Main;
import com.redesocial.models.Post;
import com.redesocial.models.Usuario;
import com.redesocial.repositories.PostRepository;

public class TimeLine {
    public void visualizarTimeLineUsuário(PostRepository postRepository, Usuario usuario){
        Post[] posts = postRepository.pegarPosts(usuario);
        if (posts.length == 0) {
            System.out.println("Você não fez nenhum post ainda!");
            System.out.println();
        } else {
            for (Post post : posts) {
                System.out.println(post);
            }
        }
    }

    public void visualizarTimeLineRedeSocial(PostRepository postRepository){
        Usuario[] usuarios = Main.usuarios;
        for (int i = 0; i < Main.qntUsuarios; i++) {
            Post[] posts = postRepository.pegarPosts(usuarios[i]);
            System.out.println("- " + usuarios[i].getNome() + " (" + usuarios[i].getLogin() + "):" );
            System.out.println();
            for (Post post : posts) {
                System.out.println(post);
            }
        }
    }
}
