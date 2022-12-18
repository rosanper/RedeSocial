package com.redesocial.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
    private String data;
    private String hora;
    private String conteudo;

    @Override
    public String toString() {
        return data + " às " + hora + " - " + "\"" + conteudo + "\"";
    }

    public Post(String conteudo) {
        this.data = new SimpleDateFormat("dd/mm/yyyy").format(new Date());
        this.hora = new SimpleDateFormat("HH:mm:ss").format(new Date());
        this.conteudo = conteudo;
    }

}
