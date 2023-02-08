public class Cikli {
    public static void main(String[] args) {
        int i = 2;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }
        int n = 2;
        do {
            System.out.println("Sample : " + n);
            n--;
        } while (n > 0);

        for (int x = 1; x < 5; x++) {
            System.out.println("Count is " + x);
        }
        for (;;) {
            System.out.println("Infinite loop!");
        }


    }
}
