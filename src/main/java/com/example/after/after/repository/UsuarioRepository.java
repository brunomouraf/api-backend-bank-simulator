package com.example.after.after.repository;

import com.example.after.after.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    List<Usuario> findByEmail(String email);
    List<Usuario> findByNomeCompleto(String nomeCompleto);
    boolean existsByNomeCompleto(String nomeCompleto);
    boolean existsByEmail(String email);
    boolean existsBySenha(String senha);
}
