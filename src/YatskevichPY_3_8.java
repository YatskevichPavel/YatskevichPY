import java.util.Scanner;

class YatskevichPY_3_8 {


    public static void main(String args[]) {
        double a, b, c;
        double D;
        System.out.println("Программа для решения квадратных уравнений");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите через пробел без запятой значения a, b и c :");
        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Уровнение имеет два корня: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет один корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет корней");
        }
    }
}
