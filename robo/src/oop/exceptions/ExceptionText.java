package oop.exceptions;

public class ExceptionText {
    public static void main(String[] args) {
        int y = 10;

        try {
            y++;
            int x =1 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Nu se poate face operatia ");

        }
        catch (Exception e){
            System.out.println("Eroare de executie");
        }
        System.out.println(y);
    }
}