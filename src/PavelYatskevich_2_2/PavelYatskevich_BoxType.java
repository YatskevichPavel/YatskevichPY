package PavelYatskevich_2_2;

public class PavelYatskevich_BoxType {
    public enum BoxType {
        CUBE,
        ENVELOPE,
        BASIC
    }

        private int x;
        private int y;
        private int z;
        private BoxType type;


    public PavelYatskevich_BoxType(int x) {
        this.x = x;
        this.y = x;
        this.z = x;
        this.type = BoxType.CUBE;
    }

    public PavelYatskevich_BoxType(int x, int y) {
        this.x = x;
        this.y = y;
        this.type = BoxType.ENVELOPE;
    }


    public PavelYatskevich_BoxType(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.type = BoxType.BASIC;

    }

    public BoxType getBoxType() {

        return type;
    }
    public static void main (String [] args) {
        PavelYatskevich_BoxType box1 = new PavelYatskevich_BoxType(5);
        PavelYatskevich_BoxType box2 = new PavelYatskevich_BoxType(5, 10);
        PavelYatskevich_BoxType box3 = new PavelYatskevich_BoxType(2, 0,0);
        System.out.println(box1.getBoxType());
        System.out.println(box2.getBoxType());
        System.out.println(box3.getBoxType());
    }
}
