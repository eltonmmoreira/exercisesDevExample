package com.devBootCamp.exercicio6;

import com.devBootCamp.exercicio6.item.Item;
import com.devBootCamp.exercicio6.item.ItemService;
import com.devBootCamp.exercicio6.item.ItemServiceImpl;
import com.devBootCamp.exercicio6.notaFiscal.NotaFiscal;
import com.devBootCamp.exercicio6.notaFiscal.NotaFiscalItem;
import com.devBootCamp.exercicio6.notaFiscal.NotaFiscalService;
import com.devBootCamp.exercicio6.notaFiscal.NotaFiscalServiceImpl;
import com.devBootCamp.exercicio6.pessoa.Pessoa;
import com.devBootCamp.exercicio6.pessoa.PessoaService;
import com.devBootCamp.exercicio6.pessoa.PessoaServiceImpl;

import java.math.BigDecimal;

public class Main4 {

    public static void main(String[] args) {
        NotaFiscalService notaFiscalService = new NotaFiscalServiceImpl();
        PessoaService pessoaService = new PessoaServiceImpl();

        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("123123123123");
        pessoa.setNome("Elton");
        pessoa.setEmail("elton@visaoft.com.br");
        pessoa = pessoaService.save(pessoa);

        Integer idPessoa = pessoa.getId();


        ItemService itemService = new ItemServiceImpl();

        NotaFiscal notaFiscal = new NotaFiscal();

        Pessoa pessoaNotaFiscal = pessoaService.findById(idPessoa);
        notaFiscal.setPessoa(pessoaNotaFiscal);

        Item item = new Item();
        item.setDescricao("fdsafdsafds");
        item.setQuantidade(BigDecimal.TEN);
        itemService.save(item);

        Item item2 = new Item();
        item2.setDescricao("543345grgrtetre");
        item2.setQuantidade(BigDecimal.ONE);
        itemService.save(item2);

        try {
            NotaFiscalItem notaFiscalItem = new NotaFiscalItem();
            notaFiscalItem.setId(1);
            notaFiscalItem.setNotaFiscal(notaFiscal);
            notaFiscalItem.setItem(item);
            notaFiscalItem.setQuantidade(BigDecimal.valueOf(1));

            NotaFiscalItem notaFiscalItem2 = new NotaFiscalItem();
            notaFiscalItem2.setId(2);
            notaFiscalItem2.setNotaFiscal(notaFiscal);
            notaFiscalItem2.setItem(item2);
            notaFiscalItem2.setQuantidade(BigDecimal.valueOf(1));

            notaFiscal.getNotaFiscalItemList().add(notaFiscalItem);
            notaFiscal.getNotaFiscalItemList().add(notaFiscalItem2);

            notaFiscal = notaFiscalService.save(notaFiscal);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(notaFiscal.getId());

        var list = notaFiscalService.findAll();

        for (NotaFiscal nf : list) {
            System.out.println(nf.getId());
            for (NotaFiscalItem nfi : nf.getNotaFiscalItemList()) {
                System.out.println(nfi.getItem().getDescricao());
                System.out.println(nfi.getQuantidade());
            }
        }

    }
}
