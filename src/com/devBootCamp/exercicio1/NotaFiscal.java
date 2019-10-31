package com.devBootCamp.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private Integer id;
    private Integer numero;
    private Cliente cliente;
    private Endereco enderecoEntrega;
    private List<NotaFiscalItem> notaFiscalItemList = new ArrayList<>();
    private Double valorTotal;

    public NotaFiscal(Cliente cliente) {
        this.cliente = cliente;
        enderecoEntrega = cliente.getEnderecoDeEntrega();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public List<NotaFiscalItem> getNotaFiscalItemList() {
        return notaFiscalItemList;
    }

    public void adicionarProduto(NotaFiscalItem notaFiscalItem) {
        if (!produtoJaAdicionado(notaFiscalItem)) {
            notaFiscalItemList.add(notaFiscalItem);
            calculaValorTotal();
        }
    }

    private boolean produtoJaAdicionado(NotaFiscalItem notaFiscalItem) {
        for (NotaFiscalItem fiscalItem : notaFiscalItemList) {
            if (fiscalItem.getProduto().getId().equals(notaFiscalItem.getProduto().getId())) {
                System.out.println("Produto: " + notaFiscalItem.getProduto().getId() + " - "
                        + notaFiscalItem.getProduto().getDescricao()
                        + " já adicionado na nota.");
                return true;
            }
        }
        return false;
    }

    private void calculaValorTotal() {
        valorTotal = 0D;
        for (NotaFiscalItem notaFiscalItem : notaFiscalItemList) {
            valorTotal += notaFiscalItem.getValorTotal();
        }
    }

    public void resumo() {
        System.out.println("Número: " + numero);
        if (enderecoEntrega != null) {
            System.out.println("Endereço de Entrega: ");
            enderecoEntrega.dadosEndereco();
        } else {
            System.out.println("Endereço de Entrega não informado!");
        }

        cliente.dadosDoCliente();
        for (NotaFiscalItem notaFiscalItem : notaFiscalItemList) {
            notaFiscalItem.dadosNotaFiscalItem();
            System.out.println();
        }
        System.out.println("Valor Total: " + valorTotal);
    }
}
