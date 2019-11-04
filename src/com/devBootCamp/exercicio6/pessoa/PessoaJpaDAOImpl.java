package com.devBootCamp.exercicio6.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PessoaJpaDAOImpl implements PessoaCrudDAO {

    private List<Pessoa> pessoaList = new ArrayList<>();

    @Override
    public Pessoa save(Pessoa pessoa) {
        Integer id = new Random().nextInt();
        pessoa.setId(Math.abs(id));
        System.out.println("[JPA] - Registro incluido com sucesso");
        pessoaList.add(pessoa);
        return pessoa;
    }

    @Override
    public List<Pessoa> findAll() {
        System.out.println("[JPA] - findAll");
        return pessoaList;
    }

    @Override
    public void delete(Integer id) {
        pessoaList.removeIf(pessoa -> pessoa.getId().equals(id));
        System.out.println("[JPA] - delete");
    }

    @Override
    public Pessoa findById(Integer id) {
        System.out.println("[JPA] - findById");
        for (Pessoa pessoa : pessoaList) {
            if (pessoa.getId().equals(id)) {
                return pessoa;
            }
        }

        return new Pessoa();
//      return pessoaList.stream()
//                .filter(pessoa -> pessoa.getId().equals(id))
//                .findAny()
//                .orElse(new Pessoa());
    }
}
