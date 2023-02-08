import java.util.Scanner;


public class YatskevichPY_4_8 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        String b = scanner.nextLine();
        System.out.println("Вы ввели число " + a);
        do {
            if (b.equals("END")) {
                break;
            } else if (a % 2 == 0) {
                System.out.println("Число четное");
            } else if (a % 2 == 1) {
                System.out.println("Число нечетное");
            }
        } while (false);
    }
}


