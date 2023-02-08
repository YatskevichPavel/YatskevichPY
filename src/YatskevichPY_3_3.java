import java.util.Scanner;

class YatskevichPY_3_3 {
        public static void main(String args[]) {
        System.out.print("Введите любое целое положительное число:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Вы ввели число " + number);
        String question;
        question = number % 2 == 1 ? (number % 2 == 0 ?"Число четное" : "Число нечетное"): "Введено отрицательное число";
        System.out.println(question);

    }
}