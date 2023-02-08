import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class PavelYatskevich_1_4 {
    public static void main(String[] args) {
        int array[][] = {{1, 2, 3, -1}, {-1, -5, -7, 8}, {1, 2, -3, 8}};
        int negativnumbers = 0;
        int positivnumers = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < 0) negativnumbers++;
                else if (array[i][j] > 0) positivnumers++;
            }
        }
        {
            System.out.println("Количество отрицательных значений в массиве данных : " + negativnumbers);
            System.out.println("Количество положительных значений в массиве данных : " + positivnumers);
        }
        if (negativnumbers > positivnumers) {
            System.out.println("В данном массиве данных отрицательных значений больше чем положительных");
        } else if (negativnumbers < positivnumers) {
            System.out.println("В данном массиве данных положительных значений больше чем отрицательных");
        }
        else if (negativnumbers == positivnumers) {
            System.out.println("В данном массиве данных количество положительных значений равно количеству отрицательных значений");
        }
    }
}




