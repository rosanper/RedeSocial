package com.redesocial.repositories;

import com.redesocial.models.Usuario;
import com.redesocial.models.Post;


import java.util.List;

public class PostRepository {

    public List<Post> pegarPosts(Usuario usuario){
        List<Post> posts = usuario.getPosts();
        return posts;
    }

    public void adicionarPost(Usuario usuario, String conteudo){
        Post post = new Post(conteudo);
        List<Post> posts = usuario.getPosts();
        posts.add(post);
        usuario.setPosts(posts);

    }
}
