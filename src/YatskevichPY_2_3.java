public class YatskevichPY_2_3 {
    public static void main(String[] args) {
        long longVar = 1_000_000_000L;
        byte byteVar = (byte) longVar;
        short shortVar = (short) longVar;
        int intVar = (int) longVar;
        float floatVar = (float) longVar;
        double doubleVar = (double) longVar;
        System.out.println("longVar = " + longVar);
        System.out.println("byteVar = " + byteVar);
        System.out.println("shortVar = " + shortVar);
        System.out.println("intVar = " + intVar);
        System.out.println("floatVar = " + floatVar);
        System.out.println("doubleVar = " + doubleVar);
        /* Для типа Int присвоилось такое же значение как и в long так как данное число входит в диапозон Int*/
    }
}
