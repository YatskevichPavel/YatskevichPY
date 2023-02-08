package by.itacademy.classwork;

public class Address {
    public String city;
    public String country;
    private String street;
    private int house;

    public Address (String city, String country, String street, int house) {
        this.house = house;
        this.street = street;
        this.country = country;
        this.city = city;
    }
    public void print() {
        System.out.println(city + " " + country + " " + street + " " + house);
    }

    public static void main (String[] args) {
    Address Minsk = new Address("Minsk", "Belarus", "Nemiga", 20);
    Minsk.print();
    }
}