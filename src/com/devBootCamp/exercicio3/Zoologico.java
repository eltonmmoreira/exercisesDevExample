package com.devBootCamp.exercicio3;

import java.util.List;

public class Zoologico {

    public void caracteristicasDoAnimal(List<Animal> animais) {
        for (Animal animal : animais) {
            caracteristicasDoAnimal(animal);
            System.out.println();
        }
    }

    public void caracteristicasDoAnimal(Animal animal) {
        System.out.println("Animal: " + animal.animal());
        System.out.println("Som do Animal: " + animal.somDoAnimal());
        System.out.println("Cor do Animal: " + animal.corDoAnimal());
    }

    public void caracteristicasDoCavalo(Cavalo cavalo) {
        System.out.println("Animal: " + cavalo.somDoAnimal());
        System.out.println("Som do Animal: " + cavalo.somDoAnimal());
        System.out.println("Cor do Animal: " + cavalo.corDoAnimal());
    }

    public void caracteristicasDoGato(Gato gato) {
        System.out.println("Animal: " + gato.somDoAnimal());
        System.out.println("Som do Animal: " + gato.somDoAnimal());
        System.out.println("Cor do Animal: " + gato.corDoAnimal());
    }

    public void caracteristicasDoCatioro(Cachorro cachorro) {
        System.out.println("Animal: " + cachorro.animal());
        System.out.println("Som do Animal: " + cachorro.somDoAnimal());
        System.out.println("Cor do Animal: " + cachorro.corDoAnimal());
    }

}
