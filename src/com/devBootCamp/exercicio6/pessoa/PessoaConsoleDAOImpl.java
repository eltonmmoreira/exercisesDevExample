package com.devBootCamp.exercicio6.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PessoaConsoleDAOImpl implements PessoaCrudDAO {

    @Override
    public Pessoa save(Pessoa pessoa) {
        Integer id = new Random().nextInt();
        pessoa.setId(Math.abs(id));
        System.out.println("[console] - Registro incluido com sucesso");
        return pessoa;
    }

    @Override
    public List<Pessoa> findAll() {
        System.out.println("[console] - findAll");
        return new ArrayList<>();
    }

    @Override
    public void delete(Integer id) {
        System.out.println("[console] - delete");
    }

    @Override
    public Pessoa findById(Integer id) {
        System.out.println("[console] - findById");
        return new Pessoa();
    }
}
