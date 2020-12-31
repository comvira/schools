package homework1;

public class Animal {
    private String name;
    public Animal() {
        System.out.println("Создание Animal");
    }

    public Animal(String theNama) {
        name = theNama;
    }

    public String getName() {
        return name;
    }
}