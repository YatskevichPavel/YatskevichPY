import java.util.Arrays;

public class PavelYatskevich_1_1 {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 4, 6};
        System.out.println("Первоначальный массив данных : " + Arrays.toString(array));
        int sum1 = 0;
        for (int i:array)
            sum1 += i;
        System.out.println("Сумма данных первоначального массива данных: " + sum1);
        int n = 4;
        int sum2 = 0;
        int newarray = array.length;
        for (int i = 0; i < newarray; i++) {
            if (array[i] == n) array[i] = 0;
        }
        for (int i = 0; i < newarray; ++i) {
            sum2 += array[i];
        }
        System.out.println("Сумма массива без числа n: " + sum2);
    }
}







