package com.devBootCamp.exercicio3;

public class Gato implements Animal {

    @Override
    public String somDoAnimal() {
        return "MIAU";
    }

    @Override
    public String corDoAnimal() {
        return "Branco";
    }

    @Override
    public String animal() {
        return "Gato";
    }
}
