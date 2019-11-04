package com.devBootCamp.exercicio6.pessoa;

import com.devBootCamp.exercicio6.crud.CrudService;

import java.util.List;

public interface PessoaService extends CrudService<Pessoa> {

    void atualizarEndereco(String rua, String numero);

}
