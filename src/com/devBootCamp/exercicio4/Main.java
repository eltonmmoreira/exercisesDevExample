package com.devBootCamp.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        Double valorBaseCalculo = 100D;
        var icms = new Icms(valorBaseCalculo);
        var pis = new Pis(valorBaseCalculo);
        var cofins = new Confins(valorBaseCalculo);
        var ipi = new Ipi(valorBaseCalculo);

        Double valorICMS = calculadorDeImpostos.calcularImposto(icms);
        Double valorPIS = calculadorDeImpostos.calcularImposto(pis);
        Double valorCOFINS = calculadorDeImpostos.calcularImposto(cofins);
        Double valorIPI = calculadorDeImpostos.calcularImposto(ipi);

        List<Imposto> impostos = new ArrayList<>();
        impostos.add(icms);
        impostos.add(pis);
        impostos.add(cofins);
        impostos.add(ipi);

        var totalImpostos = calculadorDeImpostos.calcularImposto(impostos);

        System.out.println("Valor ICMS " + valorICMS);
        System.out.println("Valor PIS " + valorPIS);
        System.out.println("Valor COFINS " + valorCOFINS);
        System.out.println("Valor COFINS " + valorIPI);
        System.out.println("Valor Total Impostos " + totalImpostos);
    }
}
