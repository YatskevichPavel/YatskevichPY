import java.util.Scanner;

class YatskevichPY_3_5 {


    public static void main(String args[]) {
        System.out.print("Введите число от 1 до 7: ");
        Scanner scan = new Scanner(System.in);
        int dayoftheweek = scan.nextInt();
        if (dayoftheweek == 1) {
            System.out.println("понедельник");
        } else if (dayoftheweek == 2) {
            System.out.println("Вторник");
        } else if (dayoftheweek == 3) {
            System.out.println("Среда");
        } else if (dayoftheweek == 4) {
            System.out.println("Четверг");
        } else if (dayoftheweek == 5) {
            System.out.println("Пятница");
        } else if (dayoftheweek == 6) {
            System.out.println("Суббота");
        } else if (dayoftheweek == 7) {
            System.out.println("Воскресенье");
        } else if (dayoftheweek == 0) {
            System.out.println("Вы ввели ноль");
        } else  if (dayoftheweek < 0) {
            System.out.println("Вы ввели отрицательное число");
        } else {
            System.out.println("В недели только семь дней)");
        }
    }
}