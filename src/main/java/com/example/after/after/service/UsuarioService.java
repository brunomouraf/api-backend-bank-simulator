package com.example.after.after.service;

import com.example.after.after.request.UsuarioCadastroRequest;
import com.example.after.after.request.UsuarioFotoRequest;
import com.example.after.after.request.UsuarioLoginRequest;
import com.example.after.after.response.UsuarioBuscaResponse;
import com.example.after.after.response.UsuarioLoginResponse;
import com.example.after.after.model.Usuario;
import com.example.after.after.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvarUsuario(UsuarioCadastroRequest usuarioCadastroRequest){
        Usuario client = usuarioCadastroRequest.saveRequestObject();

        return usuarioRepository.save(client);
    }

    public UsuarioLoginResponse loginClient(UsuarioLoginRequest usuarioLoginRequest){
        if (usuarioRepository.existsByEmail(usuarioLoginRequest.getEmail()) && usuarioRepository.existsBySenha(usuarioLoginRequest.getSenha())) {
            List<Usuario> usuario = usuarioRepository.findByEmail(usuarioLoginRequest.getEmail());
            UsuarioLoginResponse usuarioLoginResponse =
                    new UsuarioLoginResponse(usuario.get(0).getNomeCompleto(),
                            usuario.get(0).getDescricao(),
                            usuario.get(0).getFotoPerfil(),
                            usuario.get(0).getNumeroSeguidores(),
                            usuario.get(0).getNumeroSeguindo(),
                            usuario.get(0).getPublicacoes());

            return usuarioLoginResponse;
        }

        throw new RuntimeException("Usuario ou senha incorretos");
    }

    public List<Usuario> pesquisarUsuario(String nomeCompleto){
        if(usuarioRepository.existsByNomeCompleto(nomeCompleto)){
            List<Usuario> usuario = usuarioRepository.findByNomeCompleto(nomeCompleto);

            return usuario ;
        }
        throw new RuntimeException("Usuario não encontrado" + nomeCompleto);
    }

    public Usuario salvarFotoPerfil(UsuarioFotoRequest usuarioFotoRequest){
        List<Usuario> usuario = usuarioRepository.findByEmail(usuarioFotoRequest.getEmail());
        usuario.get(0).setFotoPerfil(usuarioFotoRequest.getFotoPerfil());

        return usuarioRepository.save(usuario.get(0));
    }

}
