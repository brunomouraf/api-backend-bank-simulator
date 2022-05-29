package com.example.after.after.request;

import com.example.after.after.model.Usuario;

public class UsuarioCadastroRequest {

    private String nomeCompleto;
    private String email;
    private String senha;
    private String telefone;
    private String descricao;

    public UsuarioCadastroRequest() {
    }

    public UsuarioCadastroRequest(String nomeCompleto, String email, String senha, String telefone, String descricao) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.descricao = descricao;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario saveRequestObject(){
        Usuario usuario = new Usuario();
        usuario.setNomeCompleto(this.nomeCompleto);
        usuario.setEmail(this.email);
        usuario.setSenha(this.senha);
        usuario.setTelefone(this.telefone);
        usuario.setDescricao(this.descricao);

        return usuario;
    }
}
