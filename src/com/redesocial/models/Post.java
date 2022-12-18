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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }


}
