package oop;

public class Dog {
    int size;

    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            if (size > 60) {
                System.out.println("Woof!");

            } else if (size > 14) {
                System.out.println("Ruff!");
            } else {
                System.out.println("Yip!");
            }
        }
    }
}