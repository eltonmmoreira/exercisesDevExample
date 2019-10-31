package com.devBootCamp.exercicio1;


import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Integer id;
    private String nome;
    private String cpf;
    private List<Endereco> enderecoList = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void adicionarEndereco(Endereco endereco) {
        if (!enderecoDeEntregaJaAdicionado(endereco)) {
            enderecoList.add(endereco);
        }
    }

    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    private boolean enderecoDeEntregaJaAdicionado(Endereco endereco) {
        if (TipoEndereco.ENTREGA.equals(endereco.getTipoEndereco())) {
            for (Endereco e : enderecoList) {
                if (TipoEndereco.ENTREGA.equals(e.getTipoEndereco())) {
                    System.out.println("Endereço: " + endereco.getRua() + " já adicionado!");
                    return true;
                }
            }
        }

        return false;
    }

    public Endereco getEnderecoDeEntrega() {
        for (Endereco endereco : enderecoList) {
            if (TipoEndereco.ENTREGA.equals(endereco.getTipoEndereco())) {
                return endereco;
            }
        }

        return null;
    }

    public void dadosDoCliente() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereços: ");
        System.out.println();
        for (Endereco endereco : enderecoList) {
            endereco.dadosEndereco();
            System.out.println();
        }
    }
}
