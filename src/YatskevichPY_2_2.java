public class YatskevichPY_2_2 {
    public static void main(String[] args){
    byte byteVar = 10;
    short shortVar = byteVar;
    int intVar = byteVar;
    long longVar = byteVar;
    float floatVar = byteVar;
    double doubleVar = byteVar;
        System.out.println("byteVar = " + byteVar);
        System.out.println("shortVar = " + shortVar);
        System.out.println("intVar = " + intVar);
        System.out.println("longVar = " + longVar);
        System.out.println("floatVar = " + floatVar);
        System.out.println("doubleVar = " + doubleVar);
        /*Для типа INT вывелось значение 10 так как INT по умолчанию целое число (23,56,128 и т.д),
        а Float по умолчанию дробное (1.001, 2.26 и т.д.)*/;
        }
}
