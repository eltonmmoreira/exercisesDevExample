package com.devBootCamp.exercicio6.notaFiscal;

import com.devBootCamp.exercicio6.item.Item;

import java.math.BigDecimal;

public class NotaFiscalItem {
    private Integer id;
    private NotaFiscal notaFiscal;
    private Item item;
    private BigDecimal quantidade;
    private BigDecimal valorUnitario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
