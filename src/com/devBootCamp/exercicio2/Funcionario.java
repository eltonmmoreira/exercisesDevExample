package com.devBootCamp.exercicio2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private LocalDate dataDeAdmissao;

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public BigDecimal calculaSalario() {
        return salario;
    }
}
