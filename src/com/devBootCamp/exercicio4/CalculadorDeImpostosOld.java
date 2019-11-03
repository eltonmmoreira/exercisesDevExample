package com.devBootCamp.exercicio4;

public class CalculadorDeImpostosOld {

    public Double calcular(String imposto, Double valor) {
        if ("ICMS".equals(imposto)) {
            return valor * 0.10;
        }
        else if (imposto.equals("PIS"))
            return valor * 0.20;
        else if (imposto.equals("COFINS"))
            return valor * 0.50;
        else if ("IPI".equals(imposto)) {
            return valor * 0.25;
        }
        return valor;
    }
}
