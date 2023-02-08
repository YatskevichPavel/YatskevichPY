package PavelYatskevich_2_3;

public class PavelYatskevich_2_3 {
    private int number = 0;
    private int[] array = new int[5];

    public void consume(int data) {
        if (number == array.length) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (i == 0) {
                    array[i] = data;
                } else {
                    array[i] = array[i - 1];
                }
            }
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                if (i == 0) {
                    array[i] = data;
                } else {
                    array[i] = array[i - 1];
                }
            }
            ++number;
        }
    }
    public float avg() {
        float sum = 0;
        float Elements = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                sum += array[i];
                ++Elements;
            }
        }
        return sum / Elements;
    }
    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        PavelYatskevich_2_3 consumer = new PavelYatskevich_2_3();
        float avg;
        consumer.consume(1);
        consumer.consume(2);
        consumer.consume(3);
        consumer.consume(4);
        consumer.consume(5);
        consumer.consume(6);
        avg = consumer.avg();
        consumer.print();
        System.out.println();
        System.out.println(avg);
    }
}
