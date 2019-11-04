package com.devBootCamp.exercicio2;

import java.util.List;

public class RelatorioSalario {

    public void resumoSalario(Funcionario funcionario) {
        funcionario.calculaSalario();
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.calculaSalario());
    }

    public void resumoSalario(List<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            resumoSalario(funcionario);
        }
    }

    public void resumoSalarioProfessor(Professor professor) {
        System.out.println("Salario professor");
        System.out.println(professor.calculaSalario());
    }

    public void resumoSalarioFinanceiro(Financeiro financeiro) {
        System.out.println("Salario Financeiro");
        System.out.println(financeiro.calculaSalario());
    }

}
