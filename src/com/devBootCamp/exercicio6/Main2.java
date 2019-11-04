package com.devBootCamp.exercicio6;

import com.devBootCamp.exercicio6.pessoa.Pessoa;
import com.devBootCamp.exercicio6.pessoa.PessoaService;
import com.devBootCamp.exercicio6.pessoa.PessoaServiceImpl;
import com.devBootCamp.exercicio6.usuario.Usuario;
import com.devBootCamp.exercicio6.usuario.UsuarioService;
import com.devBootCamp.exercicio6.usuario.UsuarioServiceImpl;

import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioServiceImpl();

        Usuario usuario = new Usuario();
        usuario.setNome("Elton");
        usuarioService.save(usuario);

        Usuario usuario2 = new Usuario();
        usuario2.setNome("TEste 2");
        usuarioService.save(usuario2);

        List<Usuario> usuarios = usuarioService.findAll();

        for (Usuario u : usuarios) {
            System.out.println("usuario id: " + u.getId());
            System.out.println("usuario: " + u.getNome());
        }
    }
}
