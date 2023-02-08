import java.util.Scanner;

class YatskevichPY_3_6 {


    public static void main(String args[]) {
        System.out.print("Введите номер дня недели:");
        Scanner scan = new Scanner(System.in);
        int dayoftheweek = scan.nextInt();
        boolean userChoise = false;
        switch (dayoftheweek) {
            case 1:
                System.out.println(userChoise ? "Понедельник" : "Mondey");

                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня нет");
        }
    }
}
