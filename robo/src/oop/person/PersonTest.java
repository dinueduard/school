package oop.person;

public class PersonTest {
    public static void main(String[] args) {
        Person vito = new Person(  "Don Vito" ,  100);
        Person sony = new Person("Supersonic" , 200);
        Child alex = new Child ("Alex" , 50 );
        vito.run();
        vito.run();
        vito.showEnergy();
        vito.run();
        vito.showEnergy ();
        vito.sleep();
        vito.showEnergy();

        System.out.println("Alex: " + alex );
        System.out.println(sony);
        alex.run();
        alex.showEnergy();
        alex.sleep();
        alex.showEnergy();

        for (int i=0 ; i<5; i++) {
            sony.run();
        }
            sony.showEnergy();
        }
    }

