package com.devBootCamp.exercicio4;

public class Confins implements Imposto {

    private Double valorBase;

    public Confins(Double valorBase) {
        this.valorBase = valorBase;
    }

    @Override
    public Double calcularImposto() {
        return valorBase * 0.30;
    }
}
