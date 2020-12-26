package fun.sora;

public class Main {//Начало объявления класса Main
    /*
    Многострочный комментарий
    Обьъявление нового класса,
    который содержит код программы.
     */
    static final int LIMIT = 4;
        public static int t = 375;

    public static void main(String[] args) {
        t = 10;
        System.out.println("HelloAppПеченьки");
        int bobic, moska;
        bobic = 10;
        moska = 5;
        System.out.println("bobic = " + bobic);
        System.out.println("t = " + t);
        System.out.println("moska = " + moska);
        System.out.println("LIMIT = " + LIMIT);
        bobic = 100;
        System.out.println("bobic = " + bobic);
        new Simka();
    }
}
