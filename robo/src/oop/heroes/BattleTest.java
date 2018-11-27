package oop.heroes;

public class BattleTest {
    public static void main(String[] args) {
        Warrior batman = new Warrior(10, 10);
        Mage joker = new Mage(15 , 0);
        battle(batman, joker);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void battle (Hero aHero, Hero anotherHero) {
        aHero.doAttack();
        anotherHero.doTakeDamage();
        System.out.println(aHero);
        System.out.println(anotherHero);
        anotherHero.doAttack();
        aHero.doTakeDamage();
        aHero.doAttack();
        anotherHero.doTakeDamage();
        System.out.println(anotherHero);
        anotherHero.doAttack();
        aHero.doTakeDamage();
        System.out.println(aHero);
        System.out.println(anotherHero);
        anotherHero.doAttack();
        aHero.doTakeDamage();
        System.out.println(aHero);
        anotherHero.doAttack();
        aHero.doTakeDamage();
        System.out.println(aHero);
        aHero.doAttack();
        anotherHero.doTakeDamage();
        System.out.println(anotherHero);




    }
}
