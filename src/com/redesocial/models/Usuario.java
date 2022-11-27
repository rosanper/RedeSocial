package com.redesocial.models;


public class Usuario {
    private String nome;
    private String login;
    private String senha;

    private Post[] posts = new Post[100];

    private int qntPost = 0;

    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }

    public int getQntPost() {
        return qntPost;
    }

    public void setQntPost(int qntPost) {
        this.qntPost = qntPost;
    }

    @Override
    public String toString() {
        return "com.redesocial.models.Usuario{" +
                "nome='" + nome + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
