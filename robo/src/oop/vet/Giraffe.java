package oop.vet;

public class Giraffe implements WildAnimalPet {
    @Override
    public void makeNoise() {
        System.out.println("gif!gif!");
    }
    public void sleep (){
        System.out.println("zzZZzzZZzz");
    }

    @Override
    public void play() {
        System.out.println("Head down");
    }
}
