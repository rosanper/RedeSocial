package com.redesocial.repositories;

import com.redesocial.models.Usuario;
import com.redesocial.models.Post;

import java.util.Arrays;

public class PostRepository {

    public Post[] pegarPosts(Usuario usuario){
        Post[] posts = usuario.getPosts();
        return Arrays.copyOf(posts,usuario.getQntPost());
    }

    public void adicionarPost(Usuario usuario, String conteudo){
        Post post = new Post(conteudo);
        Post[] posts = usuario.getPosts();
        posts[usuario.getQntPost()] = post;
        usuario.setPosts(posts);

        int novaQntPosts = usuario.getQntPost() + 1;
        usuario.setQntPost(novaQntPosts);
    }
}
