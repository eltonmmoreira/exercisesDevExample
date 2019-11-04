package com.devBootCamp.exercicio2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Elton");
        pessoa.setCpf("12312312");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println();

        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("4781748127381");
        funcionario.setNome("Funcionario");
        funcionario.setDataDeAdmissao(LocalDate.now().minusYears(1));
        funcionario.setSalario(BigDecimal.valueOf(1000));
        System.out.println("Funcionario: ");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Admissao: " + funcionario.getDataDeAdmissao());
        System.out.println("Salário: " + funcionario.calculaSalario());
        System.out.println();

        System.out.println("Aluno: ");
        Aluno aluno = new Aluno();
        aluno.setNome("Aluno Teste");
        aluno.setCpf("1312312312312321");

        Curso ads = new Curso(1, "ADS", 4);
        Curso adm = new Curso(2, "ADM", 4);

        Integer matricula = aluno.matricularAluno(ads);
        System.out.println(matricula);

        Integer matriculaADM = aluno.matricularAluno(adm);
        System.out.println(matriculaADM);

        Integer matricula1 = aluno.matricularAluno(adm);
        System.out.println(matricula1);

        System.out.println("Cursos do Aluno: ");
        for (AlunoCurso alunoCurso : aluno.getCursoList()) {
            System.out.println(alunoCurso.getMatricula());
            System.out.println(alunoCurso.getCurso().getNome());
            System.out.println(alunoCurso.getDataDeInicio());
            System.out.println();
        }

        Professor professor = new Professor();
        professor.setCpf("31232131231");
        professor.setNome("fhudsahfiudsh");
        professor.setDataDeAdmissao(LocalDate.now());
        professor.setSalario(BigDecimal.valueOf(4000));

        ProfessorCurso professorCurso = new ProfessorCurso();
        professorCurso.setCurso(ads);
        professorCurso.setPercentual(10D);
        professor.getProfessorCursoList().add(professorCurso);

        ProfessorCurso professorCurso2 = new ProfessorCurso();
        professorCurso2.setCurso(adm);
        professorCurso2.setPercentual(5D);
        professor.getProfessorCursoList().add(professorCurso2);

        System.out.println("Professor: ");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("CPF: " + professor.getCpf());
        System.out.println("Admissao: " + professor.getDataDeAdmissao());
        System.out.println("Salário: " + professor.calculaSalario());
        System.out.println("Cursos: ");
        for (ProfessorCurso professorCurso1 : professor.getProfessorCursoList()) {
            System.out.println("Curso: " + professorCurso1.getCurso().getNome());
            System.out.println("Percentual sobre o curso: " + professorCurso1.getPercentual());
            System.out.println();
        }

        System.out.println();

        Financeiro financeiro = new Financeiro();
        financeiro.setSalario(BigDecimal.valueOf(1300));

        System.out.println("******************************");
        RelatorioSalario relatorioSalario = new RelatorioSalario();
       // relatorioSalario.resumoSalario(financeiro);
//        relatorioSalario.resumoSalarioProfessor(professor);
//
//        relatorioSalario.resumoSalarioFinanceiro(financeiro);

        relatorioSalario.resumoSalario(financeiro);
//        relatorioSalario.resumoSalario(professor);

        relatorioSalario.resumoSalario(List.of(professor, financeiro));
    }
}
