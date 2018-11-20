package oop.heroes;

public class Warrior extends Hero {
    public Warrior(Integer energy, Integer life) {
        super(energy, life);
    }

    @Override
    public void takeDamage() {
        life-= 3 ;
    }

    @Override
    public void attack() {
        energy--;

    }
}
