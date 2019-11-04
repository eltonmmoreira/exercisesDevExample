package com.devBootCamp.exercicio6;

import com.devBootCamp.exercicio6.pessoa.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PessoaService pessoaService = new PessoaServiceImpl();
        try {
            Pessoa pessoa = new Pessoa();
            pessoa.setCpf("123123123123");
            pessoa.setNome("Elton");
            pessoa = pessoaService.save(pessoa);

            Pessoa pessoa2 = new Pessoa();
            //pessoa2.setCpf("32432423423423");
            pessoa2.setNome("Pessoa 2");
            pessoa2 = pessoaService.save(pessoa2);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        List<Pessoa> pessoaList = pessoaService.findAll();
        for (Pessoa p : pessoaList) {
            System.out.println("ID: " + p.getId());
            System.out.println("Nome: " + p.getNome());
            System.out.println("CPF: " + p.getCpf());
            System.out.println();
        }

//        Pessoa pessoa = new Pessoa();
//        pessoa.setCpf("123123123123");
//        pessoa.setNome("Elton");
//        pessoa = pessoaService.save(pessoa);
//        System.out.println("Pessoa ID: " + pessoa.getId());
//        System.out.println();
//
//        Pessoa pessoa2 = new Pessoa();
//        pessoa2.setCpf("32432423423423");
//        pessoa2.setNome("Pessoa 2");
//        pessoa2 = pessoaService.save(pessoa2);
//        System.out.println("Pessoa ID: " + pessoa2.getId());
//        System.out.println();
//
//        Pessoa pessoa3 = new Pessoa();
//        pessoa3.setCpf("5675675675675");
//        pessoa3.setNome("Pessoa 3");
//        pessoa3 = pessoaService.save(pessoa3);
//        System.out.println("Pessoa ID: " + pessoa3.getId());
//        System.out.println();
//        System.out.println();
//
//        Pessoa pessoa4 = new Pessoa();
//        pessoa4.setCpf("879879879879");
//        pessoa4.setNome("Pessoa 4");
//        pessoa4 = pessoaService.save(pessoa4);
//
//        Integer idPessoa = pessoa4.getId();
//        System.out.println("Pessoa ID: " + pessoa4.getId());
//        System.out.println();
//        System.out.println();
//
//        List<Pessoa> pessoaList = pessoaService.findAll();
//        for (Pessoa p : pessoaList) {
//            System.out.println("ID: " + p.getId());
//            System.out.println("Nome: " + p.getNome());
//            System.out.println("CPF: " + p.getCpf());
//            System.out.println();
//        }
//
//        System.out.println();
//        pessoaService.delete(pessoa2.getId());
//        pessoaList = pessoaService.findAll();
//        for (Pessoa p : pessoaList) {
//            System.out.println("ID: " + p.getId());
//            System.out.println("Nome: " + p.getNome());
//            System.out.println("CPF: " + p.getCpf());
//            System.out.println();
//        }
//
//        Pessoa pessoaTeste = pessoaService.findById(idPessoa);
//        System.out.println("ID: " + pessoaTeste.getId());
//        System.out.println("Nome: " + pessoaTeste.getNome());
//        System.out.println("CPF: " + pessoaTeste.getCpf());
//        System.out.println();
    }
}
