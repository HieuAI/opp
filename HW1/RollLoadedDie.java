public class RollLoadedDie {
    public static void main(String[] args) {
        double n = Math.random();
        if (n < 1.0 / 8.0) System.out.println("1");
        else if (n < 2.0 / 8.0) System.out.println("2");
        else if (n < 3.0 / 8.0) System.out.println("3");
        else if (n < 4.0 / 8.0) System.out.println("4");
        else if (n < 5.0 / 8.0) System.out.println("5");
        else System.out.println("6");
    }
}
