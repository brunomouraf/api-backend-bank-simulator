package com.example.after.after.Controller;

import com.example.after.after.request.UsuarioCadastroRequest;
import com.example.after.after.request.UsuarioFotoRequest;
import com.example.after.after.request.UsuarioLoginRequest;
import com.example.after.after.response.UsuarioBuscaResponse;
import com.example.after.after.response.UsuarioLoginResponse;
import com.example.after.after.service.UsuarioService;
import com.example.after.after.model.Usuario;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/after")
@RestController
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @ApiOperation(value = "Cadastro usuario")
    @RequestMapping("/registrar")
    public ResponseEntity<Usuario> registrarUsuario( @Valid @RequestBody UsuarioCadastroRequest usuarioCadastroRequest){
        System.out.println(usuarioCadastroRequest);
        Usuario usuario = usuarioService.salvarUsuario(usuarioCadastroRequest);
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Login usuario")
    @PostMapping("/login")
    public ResponseEntity<UsuarioLoginResponse> loginClient( @Valid UsuarioLoginRequest usuarioLoginRequest) {
        return new ResponseEntity<>(usuarioService.loginClient(usuarioLoginRequest), HttpStatus.OK);
    }

    @ApiOperation(value = "Busca usuario")
    @PostMapping("/buscar")
    public ResponseEntity<?> pesquisarUsuario(@Valid String nomeCompleto) {
        System.out.println(nomeCompleto);
        return new ResponseEntity<>(usuarioService.pesquisarUsuario(nomeCompleto), HttpStatus.OK);
    }

    @ApiOperation(value = "Salvar foto")
    @PostMapping("/salvar-foto")
    public ResponseEntity<Usuario> salvarFoto(@Valid UsuarioFotoRequest usuarioFotoRequest) {
        return new ResponseEntity<>(usuarioService.salvarFotoPerfil(usuarioFotoRequest), HttpStatus.OK);
    }
}
