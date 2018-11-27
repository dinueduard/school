package oop.heroes;

public class Mage extends Hero {
    public Mage(Integer energy, Integer life) {
        super(energy, life);
    }

    @Override
    public void doTakeDamage() {
        life--;
        energy++ ;

    }



    @Override
    public void doAttack() {
        energy-= 3 ;

    }


}
