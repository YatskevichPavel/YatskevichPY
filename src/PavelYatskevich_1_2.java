public class PavelYatskevich_1_2 {
    public static void main(String[] args) {

        int a;
        int b = 0;
        int c = 1;
        int n = 10;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;

            if (c % 2 == 0) {
                sum += c;
            }
        }
        System.out.println("Cумма всех четных чисел в последовательности Фибоначи, до определенного индекса n : " + sum);
    }
}


