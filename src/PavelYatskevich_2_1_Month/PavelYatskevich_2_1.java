package PavelYatskevich_2_1_Month;

public enum PavelYatskevich_2_1 {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private int number;

    PavelYatskevich_2_1(int number) {

        this.number = number;
    }

    public int getNumber() {

        return number;
    }

    public static String getNameByNumber(int number) {
        for (PavelYatskevich_2_1 pavelYatskevich_2_1 : PavelYatskevich_2_1.values()) {
            if (pavelYatskevich_2_1.number == number) {
                return pavelYatskevich_2_1.name();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        String name = "JANUARY";
        PavelYatskevich_2_1 pavelYatskevich_2_1 = PavelYatskevich_2_1.valueOf(name);
        System.out.println(pavelYatskevich_2_1.getNumber());
        System.out.println(PavelYatskevich_2_1.valueOf(name));

        System.out.println(PavelYatskevich_2_1.OCTOBER.getNumber());
        System.out.println(PavelYatskevich_2_1.DECEMBER.getNumber());
        System.out.println(PavelYatskevich_2_1.getNameByNumber(1));
        System.out.println(PavelYatskevich_2_1.getNameByNumber(2));
        System.out.println(PavelYatskevich_2_1.getNameByNumber(3));
        System.out.println(PavelYatskevich_2_1.getNameByNumber(4));
    }
}

