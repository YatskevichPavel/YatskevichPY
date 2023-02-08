package by.itacademy.classwork;

public class Phone {
    private String Number;
    private String Model;
    private int Weight;

    public Phone(String Number, String Model, int Weight) {
        this.Number = Number;
        this.Model = Model;
        this.Weight = Weight;
    }

    public void print() {
        System.out.println(Number + " " + Model + " " + Weight);
    }

    public static void main(String[] args) {
        Phone iPhone = new Phone("6415761", "12", 250);
        Phone Samsung = new Phone("6415263", "45", 260);
        Phone Huawei = new Phone("6415252", "60", 240);
        iPhone.print();
        Samsung.print();
        Huawei.print();
    }

//    public static class Factory {
//        public int employeCount;
//        public String name;
//        public Factory (int employeCount, String name) {
//            this.employeCount = employeCount;
//            this.name = name;
//        }
//        public void print() {
//            System.out.println(employeCount + "" + name);
//        }
////        public static void main (String[] args) {
//            Factory[] factories = {
//                    new Factory(20, "Vova");
//            new Factory(30, "Vasy");
//            new Factory(40, "Pety");
//           }
//            Factory result = factories[0];
//            for (int i = 1; i < factories.length; i++) {
//                if (factories[i].getEmployeCount() > result ) {
//                    result
//                }


            }

