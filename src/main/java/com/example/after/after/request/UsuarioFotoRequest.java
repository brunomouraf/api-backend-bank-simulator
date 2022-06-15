package com.example.after.after.request;

public class UsuarioFotoRequest {

    private String email;
    private String fotoPerfil;

    public UsuarioFotoRequest() {
    }

    public UsuarioFotoRequest(String email, String fotoPerfil) {
        this.email = email;
        this.fotoPerfil = fotoPerfil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
}
