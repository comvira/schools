package homework1;

public class Hippo extends Animal {
    private String name;
    private  static int countHippo = 0;

    public Hippo() {
        super();
        countHippo++;
        System.out.println("Создание Hippo");
        System.out.println(countHippo);
    }

    public Hippo(String name) {
        super(name);
        countHippo++;
        System.out.println("Создание Hippo name");
        System.out.println(countHippo);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
