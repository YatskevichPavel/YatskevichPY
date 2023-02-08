import java.util.Scanner;

public class YatskevichPY_4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a;
        boolean b = true;
        int num = scanner.nextInt();
        for (int x = 2; x <= num / 2; x++) {
            a = num % x;
            if (a == 0) {
                b = false;
                break;
            }
        }
        if (b) {
            System.out.println(num + " - простое число");
        } else {
            System.out.println(num + " - не простое число");
        }
    }
}

