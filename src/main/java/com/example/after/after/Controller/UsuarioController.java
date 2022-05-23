package com.example.after.after.Controller;

import com.example.after.after.request.UsuarioCadastroRequest;
import com.example.after.after.request.UsuarioLoginRequest;
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

@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/after")
@Api(value = "Usuario")
@RestController
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @ApiOperation(value = "Cadastro usuario")
    @RequestMapping("/registrar")
    public ResponseEntity<Usuario> registrarUsuario( @Valid UsuarioCadastroRequest usuarioCadastroRequest){
        Usuario usuario = usuarioService.salvarUsuario(usuarioCadastroRequest);
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Login usuario")
    @PostMapping("/login")
    public ResponseEntity<UsuarioLoginResponse> loginClient(@RequestBody @Valid UsuarioLoginRequest usuarioLoginRequest) {
        System.out.println(usuarioLoginRequest);
        return new ResponseEntity<>(usuarioService.loginClient(usuarioLoginRequest), HttpStatus.OK);
    }
}
