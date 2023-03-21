package com.example.after.after.model;

import javax.persistence.*;

@Entity
@Table(name = "usuario", schema = "after")
public class Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nomecompleto")
    public String nomeCompleto;
    @Column(name = "datanascimento")
    public String dataNascimento;
    @Column(name = "email")
    public String email;
    @Column(name = "idade")
    public String idade;
    @Column(name = "cidade")
    public String cidade;
    @Column(name = "telefone")
    public String telefone;
    @Column(name = "sexo")
    public String sexo;
    @Column(name = "senha")
    public String senha;
    @Column(name = "descricao")
    public String descricao;
    @Column(name = "fotoperfil")
    public String fotoPerfil;
    @Column(name = "numeroseguidores")
    public int numeroSeguidores;
    @Column(name = "numeroseguindo")
    public int numeroSeguindo;
    @Column(name = "publicacoes")
    public int publicacoes;

    public Usuario() {
    }

    public Usuario(Usuario usuario) {
        this.id = usuario.id;
        this.nomeCompleto = usuario.nomeCompleto;
        this.dataNascimento = usuario.dataNascimento;
        this.email = usuario.email;
        this.idade = usuario.idade;
        this.cidade = usuario.cidade;
        this.telefone = usuario.telefone;
        this.sexo = usuario.sexo;
        this.senha = usuario.senha;
        this.descricao = usuario.descricao;
        this.fotoPerfil = usuario.fotoPerfil;
        this.numeroSeguidores = usuario.numeroSeguidores;
        this.numeroSeguindo = usuario.numeroSeguindo;
        this.publicacoes = usuario.publicacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
