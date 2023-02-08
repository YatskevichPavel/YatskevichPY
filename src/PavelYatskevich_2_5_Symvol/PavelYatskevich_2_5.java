package PavelYatskevich_2_5_Symvol;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PavelYatskevich_2_5 {
    private static int countSymvol(String str, char symvol) {
        Matcher matcher = Pattern.compile(String.valueOf(symvol))
                .matcher(str);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        String str = "It is necessary to count the number of words in a line in which the letter c occurs 3 or more times.";
        char symvol = 'c';
        String[] strings = str.split("\\s");
        System.out.println(Arrays.toString(strings));
        System.out.println("Символ " + symvol + " встречается " + countSymvol(str, symvol) + " раз.");

    }
}