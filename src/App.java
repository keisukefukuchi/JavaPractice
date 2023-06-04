public class App {
    public static void main(String[] args) throws Exception {
        SuperHero sh = new SuperHero();
        sh.run();
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;

        Hero h = new Hero();
        h.name = "test";
        h.hp = 100;
        h.sword = s;
        System.out.println("現在の武器は、" + h.sword.name);

        Matango m1 = new Matango();
        m1.hp = 80;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 50;
        m2.suffix = 'B';

        h.slip();
        m1.run();
        m2.run();
        h.run();
    }
}
