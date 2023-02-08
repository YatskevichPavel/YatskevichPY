import java.time.Year;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

class YatskevichPY_3_7 {

    public static void main(String args[]) {
        System.out.print("Введите число:");
        Scanner scan = new Scanner(System.in);
        Calendar time = Calendar.getInstance();
        Date dateOne = time.getTime();
        System.out.println(dateOne.getDate());
        int number = scan.nextInt();
        switch (time.get(Calendar.DATE)) {
            case 1:
                System.out.println(number + (time.get(Calendar.DATE)));
                break;

        }
    }
}

