package PavelYatskevich_2_4;

public class PavelYatskevich_2_4_Car {

    public enum Colors {
        BLUE(1),
        RED(2),
        GREEN(3),
        ORANGE(4),
        BLACK(5),
        PURPLE(6),
        YELLOW(7),
        GRAY(8),
        WHITE(9);

        private int color;

        Colors(int number) {

            this.color = number;
        }

        public int getNumber() {

            return color;
        }

        public static String getNameByNumber(int number) {
            for (Colors colors : Colors.values()) {
                if (colors.color == number) {
                    return colors.name();
                }
            }
            return null;
        }
    }

    public enum CarBrand {
        AUDI(1),
        BMW(2),
        KIA(3);

        private int number;

        CarBrand(int number) {


            this.number = number;
        }

        public int getNumber() {

            return number;
        }

        public static String getNameByNumberBrand(int number) {
            for (CarBrand carBrand : CarBrand.values()) {
                if (carBrand.number == number) {
                    return carBrand.name();
                }
            }
            return null;
        }

        public static void main(String[] args) {
            System.out.println(CarBrand.getNameByNumberBrand(1) + " " + Colors.getNameByNumber(1));
            System.out.println(CarBrand.getNameByNumberBrand(2) + " " + Colors.getNameByNumber(4));
            System.out.println(CarBrand.getNameByNumberBrand(3) + " " + Colors.getNameByNumber(7));
        }
    }
}



