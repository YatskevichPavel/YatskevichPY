import java.util.Scanner;

class YatskevichPY_3_2 {
    static final String MY_CONSTANT = "Введено отрицательное число";

    public static void main(String args[]) {
        System.out.print("Введите любое целое положительное число:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Вы ввели число " + number);
        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else if (number % 2 == 1) {
            System.out.println("Число нечетное");
        } else {
            System.out.println(MY_CONSTANT);
        }
    }
}






