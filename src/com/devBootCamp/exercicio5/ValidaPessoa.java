package com.devBootCamp.exercicio5;

public class ValidaPessoa {

    public void validarPessoa(Pessoa pessoa) {
        if (pessoa.getId() == null) {
            throw new RuntimeException("TESTE ID");
        }
        if (pessoa.getCpf() == null || pessoa.getCpf().length() < 11) {
            throw new CpfInvalidoException("CPF não é valido, caracteres insuficientes.");
        }
    }
}
