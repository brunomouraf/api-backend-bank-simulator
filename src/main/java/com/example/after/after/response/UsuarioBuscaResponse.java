package com.example.after.after.response;

public class UsuarioBuscaResponse {

    public String nomeCompleto;
    public String idade;
    public String descricao;
    public String fotoPerfil;
    public int numeroSeguidores;
    public int numeroSeguindo;
    public int publicacoes;

    public UsuarioBuscaResponse() {
    }

    public UsuarioBuscaResponse(String nomeCompleto, String idade, String descricao, String fotoPerfil, int numeroSeguidores, int numeroSeguindo, int publicacoes) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.descricao = descricao;
        this.fotoPerfil = fotoPerfil;
        this.numeroSeguidores = numeroSeguidores;
        this.numeroSeguindo = numeroSeguindo;
        this.publicacoes = publicacoes;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
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

    public int getNumeroSeguidores() {
        return numeroSeguidores;
    }

    public void setNumeroSeguidores(int numeroSeguidores) {
        this.numeroSeguidores = numeroSeguidores;
    }

    public int getNumeroSeguindo() {
        return numeroSeguindo;
    }

    public void setNumeroSeguindo(int numeroSeguindo) {
        this.numeroSeguindo = numeroSeguindo;
    }

    public int getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(int publicacoes) {
        this.publicacoes = publicacoes;
    }
}
