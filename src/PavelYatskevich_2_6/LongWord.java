package PavelYatskevich_2_6;

public class LongWord {
    public static String LongWord(String str) {
        String[] words = str.split(" ");
        int index = 0;
        for (int i = 0; i < words.length; ++i) {
            final String current = words[i];
            if (current.length() > words[index].length()) {
                index = i;
            }
        }
        return words[index];
    }

    public static void main(String[] args) {
        System.out.println(LongWord("It is necessary to find the longest word in the string"));
    }
}

