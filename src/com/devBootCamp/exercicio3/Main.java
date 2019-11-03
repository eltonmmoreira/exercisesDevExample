package com.devBootCamp.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Zoologico zoologico = new Zoologico();

        zoologico.caracteristicasDoCatioro(new Cachorro());
        zoologico.caracteristicasDoCavalo(new Cavalo());
        zoologico.caracteristicasDoGato(new Gato());

        System.out.println();

        zoologico.caracteristicasDoAnimal(new Cachorro());
        zoologico.caracteristicasDoAnimal(new Gato());
        zoologico.caracteristicasDoAnimal(new Cavalo());

        System.out.println();

        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Cavalo());

        zoologico.caracteristicasDoAnimal(animais);
    }
}
