package com.example.after.after.response;

public class UsuarioLoginResponse {

    public String nomeCompleto;
    public String descricao;
    public String fotoPerfil;

    public UsuarioLoginResponse() {
    }

    public UsuarioLoginResponse(String nomeCompleto, String descricao, String fotoPerfil) {
        this.nomeCompleto = nomeCompleto;
        this.descricao = descricao;
        this.fotoPerfil = fotoPerfil;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
}
