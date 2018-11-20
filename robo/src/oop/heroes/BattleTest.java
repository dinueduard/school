package oop.heroes;

public class BattleTest {
    public static void main(String[] args) {
        Warrior batman = new Warrior(10, 10);
        Mage joker = new Mage(15 , 8);
        battle(batman, joker);

    }
    public static void battle (Hero aHero, Hero anotherHero) {
        aHero.attack();
        anotherHero.takeDamage();
        System.out.println(aHero);
        System.out.println(anotherHero);
        anotherHero.attack();
        aHero.takeDamage();
        aHero.attack();
        anotherHero.takeDamage();

    }
}
