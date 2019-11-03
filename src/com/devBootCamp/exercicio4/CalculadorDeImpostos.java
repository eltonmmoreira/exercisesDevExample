package com.devBootCamp.exercicio4;

import java.util.List;

public class CalculadorDeImpostos {

    public Double calcularImposto(Imposto imposto) {
        return imposto.calcularImposto();
    }

    public Double calcularImposto(List<Imposto> impostos) {
        return impostos.stream()
                .mapToDouble(Imposto::calcularImposto)
                .sum();
    }

}
