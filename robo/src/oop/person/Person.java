package oop.person;

public class Person {
    protected String name;
    protected Integer energy;
    protected Boolean alive = true;

    public Person(String name , Integer energy) {
        this.name = name;
        this.energy = energy;
    }

    public void run() {
       if(!alive) {
           return;
       }
            energy -= 30;
            if (energy <= 0) {
                alive = false;
            }
        }

        public void sleep () {
            if(!alive) {
                return;
            }
                energy = 100;
            }

    public void showEnergy() {
        System.out.println(name + " energy:" + energy);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                ", alive=" + alive +
                '}';
    }
}

