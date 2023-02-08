import java.util.Scanner;

public class YatskevichPY_4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        long b = 1;
        System.out.println("Введите одно натуральное число");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            for (int x = a; x > 0; x--) {
                b*=x;
            }
            System.out.println("Факториал числа " + a +" равен " + b);
        } else System.out.println("Введено не число");

    }
}



