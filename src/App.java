public class App {
    public static void main(String[] args) throws Exception {
        Hero h = new Hero();
        h.name = "test";
        h.hp = 100;

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
