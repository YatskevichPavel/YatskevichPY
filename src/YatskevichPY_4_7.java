import java.util.Scanner;
public class YatskevichPY_4_7 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int n;
        int summa;
        n = s.nextInt();
        for(int x = 0; x < n; x++){
            summa = a + b;
            a = b;
            b = summa;
            System.out.println(summa + " ");
        }
    }
}
