public class YatskevichPY_2_4 {
    public static void main(String[] args) {
        double doubleVar = 1.234567891234567;
        byte byteVar = (byte) doubleVar;
        short shortVar = (short) doubleVar;
        int intVar = (int) doubleVar;
        long longVar = (long) doubleVar;
        float floatVar = (float) doubleVar;
        System.out.println("longVar = " + longVar);
        System.out.println("byteVar = " + byteVar);
        System.out.println("shortVar = " + shortVar);
        System.out.println("intVar = " + intVar);
        System.out.println("floatVar = " + floatVar);
        System.out.println("doubleVar = " + doubleVar);
        /*Long,int,short,byte - по умолчанию целые числа, double (64bit) в short(32bit) точность потерялась*/
    }
}
