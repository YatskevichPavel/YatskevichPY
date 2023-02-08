import java.util.Scanner;

class YatskevichPY_3_10 {


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Программа для решения кубических уравнений");
        System.out.println("ax^3 + bx^2 + cx + d = 0");
        System.out.println("Введите через пробел без запятой значения a, b, c  и d: (например 4 -16 20 0)");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        if (a == 0) {
            System.out.println("если а = 0, уравнение не является кубическим");
        }
        for (int x = -100; x <= 100; x++) {
            double result = a * x * x * x + b * x * x + c * x + d;
            if (result == 0) {
                System.out.println("Уравнение имеет следующие корни Х = " + x);
                }
            }
        }
    }

