package com.devBootCamp.exercicio1;

public class Main {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setId(1);
        endereco.setNumero("123");
        endereco.setBairro("Teste");
        endereco.setRua("fdsafdsa");
        endereco.setTipoEndereco(TipoEndereco.ENTREGA);

        Endereco endereco1 = new Endereco();
        endereco1.setId(1);
        endereco1.setNumero("123");
        endereco1.setBairro("Teste");
        endereco1.setRua("fdsafdsa");
        endereco1.setTipoEndereco(TipoEndereco.COBRANCA);

        Endereco endereco2 = new Endereco();
        endereco2.setId(3);
        endereco2.setNumero("TEste");
        endereco2.setBairro("fdasfds");
        endereco2.setRua("fdsafadsf221321321fdsa");
        endereco2.setTipoEndereco(TipoEndereco.ENTREGA);

        Cliente cliente = new Cliente();
        cliente.setCpf("1111111111111");
        cliente.setNome("Elton");
        cliente.adicionarEndereco(endereco);
        cliente.adicionarEndereco(endereco1);
        cliente.adicionarEndereco(endereco2);

        Produto produto = new Produto();
        produto.setId(1);
        produto.setDescricao("ewqeqw");
        produto.setValorUnitario(10D);
        produto.setQuantidade(2D);

        Produto produto1 = new Produto();
        produto1.setId(2);
        produto1.setDescricao("rtyrtyrty");
        produto1.setValorUnitario(15D);
        produto1.setQuantidade(1D);

        NotaFiscal notaFiscal = new NotaFiscal(cliente);
        notaFiscal.setNumero(123);

        NotaFiscalItem notaFiscalItem = new NotaFiscalItem();
        notaFiscalItem.setNotaFiscal(notaFiscal);
        notaFiscalItem.setProduto(produto);
        notaFiscalItem.setQuantidade(2D);
        notaFiscalItem.setValorUnitario(20D);

        NotaFiscalItem notaFiscalItem1 = new NotaFiscalItem();
        notaFiscalItem1.setNotaFiscal(notaFiscal);
        notaFiscalItem1.setProduto(produto);
        notaFiscalItem1.setQuantidade(1D);
        notaFiscalItem1.setValorUnitario(30D);

        notaFiscal.adicionarProduto(notaFiscalItem);
        notaFiscal.adicionarProduto(notaFiscalItem1);

        notaFiscal.resumo();
    }
}
