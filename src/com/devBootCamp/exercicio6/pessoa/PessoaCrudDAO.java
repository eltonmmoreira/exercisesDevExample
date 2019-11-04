package com.devBootCamp.exercicio6.pessoa;

import java.util.List;

public interface PessoaCrudDAO {

    Pessoa save(Pessoa pessoa);

    List<Pessoa> findAll();

    void delete(Integer id);

    Pessoa findById(Integer id);
}
