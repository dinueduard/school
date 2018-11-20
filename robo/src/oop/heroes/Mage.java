package oop.heroes;

public class Mage extends Hero {
    public Mage(Integer energy, Integer life) {
        super(energy, life);
    }

    @Override
    public void takeDamage() {
        life--;
        energy++ ;

    }

    @Override
    public void attack() {
        energy-= 3 ;

    }
}
