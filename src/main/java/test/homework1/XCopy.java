package homework1;

class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }

    private int go(int orig) {
        orig = orig * 2;
        return orig;
    }
}