public class Cikli2 {
    public static void main(String[] args) {
//        //int N = 6;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(N + " * " + i + " = " + N * i);
//        }
//        for (int i = 1; i <= 512; i *= 2) {
//            System.out.println(i + " ");
//        }
//        for ( int i = 0; i < 3; i++) {
//            for ( int j = 0; j < 5; j++) {
//                System.out.print( " * ");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
