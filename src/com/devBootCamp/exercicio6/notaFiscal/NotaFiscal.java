package com.devBootCamp.exercicio6.notaFiscal;

import com.devBootCamp.exercicio6.crud.BaseObject;
import com.devBootCamp.exercicio6.pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal extends BaseObject {
    private Pessoa pessoa;
    private List<NotaFiscalItem> notaFiscalItemList = new ArrayList<>();

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<NotaFiscalItem> getNotaFiscalItemList() {
        return notaFiscalItemList;
    }

    public void setNotaFiscalItemList(List<NotaFiscalItem> notaFiscalItemList) {
        this.notaFiscalItemList = notaFiscalItemList;
    }
}
