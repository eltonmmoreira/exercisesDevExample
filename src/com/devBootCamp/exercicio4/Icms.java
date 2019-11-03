package com.devBootCamp.exercicio4;

public class Icms implements Imposto {

    private Double valorBase;

    public Icms(Double valorBase) {
        this.valorBase = valorBase;
    }

    @Override
    public Double calcularImposto() {
        return valorBase * 0.10;
    }
}
