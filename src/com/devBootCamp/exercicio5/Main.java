package com.devBootCamp.exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ValidaPessoa validaPessoa = new ValidaPessoa();
        Pessoa pessoa = new Pessoa();
        pessoa.setId(1);

        try {
            validaPessoa.validarPessoa(pessoa);
        } catch (CpfInvalidoException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage() +  " chamando outro servico");
        }

    }
}
