package by.itacademy.classwork;

public class Person {
    private String fullName;
    private int age;
    private boolean sex;
    public Person (String fullName, int age, boolean sex) {
       this.fullName = fullName;
       this.age = age;
       this.sex = sex;
    }
    public void print() {
        System.out.println(fullName + " " + age + " " + sex);
    }
    public static void main (String[] args) {
        Person Vova = new Person("Vova", 25, true);
        Person Max = new Person("Max", 26, true);
        Person Vika = new Person("Vika", 28, false);
        Vova.print();
        Max.print();
        Vika.print();
    }

    public static class Student {
        public static void main(String[] args) {

//            Box box = new Box(1, 2, 3);
//            Box box2 = new Box(1, 2, 45);

            System.out.println(Box.getClassName());
        }
    }
}
