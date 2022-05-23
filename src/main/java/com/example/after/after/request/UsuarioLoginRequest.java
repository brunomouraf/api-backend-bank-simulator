package com.example.after.after.request;

public class UsuarioLoginRequest {

    private String email;
    private String senha;

    public UsuarioLoginRequest() {
    }

    public UsuarioLoginRequest(String email, String password) {
        this.email = email;
        this.senha = password;
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
}
