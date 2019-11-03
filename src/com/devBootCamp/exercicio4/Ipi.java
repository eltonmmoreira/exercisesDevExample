package com.devBootCamp.exercicio4;

public class Ipi implements Imposto {

    private Double valorBase;

    public Ipi(Double valorBase) {
        this.valorBase = valorBase;
    }

    @Override
    public Double calcularImposto() {
        return valorBase * 0.15;
    }
}
