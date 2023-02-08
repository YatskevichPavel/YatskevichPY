package by.itacademy.classwork;

public class Box {
    private int x;
    private int y;
    private int z;

    public static String className = "BOX";
    static {

    }

    public static String getClassName() {
        return className;
    }

    //    final String name = "Box";
//
//    static final  String WELCOME_MESSAGE = "Hello";
  public Box(int newX, int newY, int newZ){
       x =newX;
       y = newY;
       z = newZ;
    }
//    int volume() {
//       return this.x * this.y * this.z;
//    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;

    }
}

