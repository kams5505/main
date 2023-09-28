public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int i = 2;
        System.out.println(i);
        double f = 2.0;
        long l = 2L;

        Integer i2 = null;
        System.out.println(i2);
        Double f2 = 2.0;
        Long l2 = 2L;

        char w = 'X';
        String name = "Kamil";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());




        int x = 0;
        int y;
        for (y=1; y<=3; y++) {
            x++;
            System.out.print(x);
            System.out.print(", ");
        }
        while (y>3 && y<=6){
            y++;
            x++;
            System.out.print(x);
            System.out.print(", ");
        }

        do {
            y++;
            x++;

            if (y<=10) {
                System.out.print(x+", ");
            }
            else{
                System.out.print(x);
            }
        } while (y>6 && y<=10);
        System.out.println();
        System.out.println("Hello");
        a();
        b();
        c();

    }
    public static void a(){
        System.out.println("Funkcja a");
    }

    protected static  void b(){
        System.out.println("Funkcja b");
    }
    private static  void c(){
        System.out.println("Funkcja c");
    }
}

