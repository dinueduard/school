package oop.heroes;

public class Warrior extends Hero {
    public Warrior(Integer energy, Integer life) {
        super(energy, life);
    }

    @Override
    public void doTakeDamage() {
        life-= 3 ;
    }



    @Override
    public void doAttack() {
        energy--;

    }


}
