package com.devBootCamp.exercicio1;

public class NotaFiscalItem {
    private Integer id;
    private NotaFiscal notaFiscal;
    private Produto produto;
    private Double valorUnitario;
    private Double quantidade;

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

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorTotal() {
        return quantidade * valorUnitario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void dadosNotaFiscalItem() {
        System.out.println("Produto: " + produto.getDescricao());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Unitário: " + valorUnitario);
        System.out.println("Valor Total: " + getValorTotal());
    }
}
