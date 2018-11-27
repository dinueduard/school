package oop.vet;

public class Hippo implements WildAnimalPet {
    @Override
    public void makeNoise() {
        System.out.println("hip!hip!");

    }

    @Override
    public void play() {
        System.out.println("Ride me ");
    }
}
