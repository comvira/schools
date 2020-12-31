package homework1;

public class TestHippo {
    public static void main(String[] args) {
        System.out.println("Начало...");
        Hippo h = new Hippo();
        System.out.println(h.getName());

        System.out.println("продолжение...");
        Hippo h2 = new Hippo("AAA");
        System.out.println(h2.getName());
    }
}


