package oop.person;

public class Child extends Person {
    public Child(String name, Integer energy) {
        super(name, energy);
    }
    public void eat () {
        energy++;
    }

    public void sleep () {
        energy = 50;
    }
}
