package PavelYatskevich_2_7;


public class Bukva {

    public static String Bukva(String str) {
        String[] words = str.split(" ");
        int index = 0;
        for (int i = 0; i < words.length; ++i) {
            if (words[i].startsWith("A"))
                if (words[i].endsWith("A")) {
                    index = i;
                }
        }
        return words[index];
    }

    public static void main(String[] args) {
        System.out.println(Bukva("It is necessary to AbbA find the longest word in the string"));
    }

}





