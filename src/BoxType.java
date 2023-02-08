public class BoxType {

    public enum Type {
        CUBE,
        ENVELOPE,
        BASIC
    }

    private int x;
    private int y;
    private int z;
    private Type type;


    public BoxType(int x) {
        this.x = x;
        this.y = x;
        this.z = x;
        this.type = Type.CUBE;
    }

    public BoxType(int x, int y) {
        this.x = x;
        this.y = y;
        this.type = Type.ENVELOPE;
    }


    public BoxType(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.type = Type.BASIC;
       
    }

    public Type getType() {
        return type;
    }

    public static void main(String[] args) {
        BoxType box = new BoxType(1);
        BoxType box1 = new BoxType(1, 2);
        BoxType box2 = new BoxType(1, 0, 1);
        System.out.println(box.getType());
        System.out.println(box1.getType());
        System.out.println(box2.getType());
    }
}