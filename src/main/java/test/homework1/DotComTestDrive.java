package homework1;

import java.util.Scanner;

public class DotComTestDrive {
    public static void main(String[] args) {
        DotCom dot = new DotCom();
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int col = 0;

        dot.mRandom();

        while (true) {
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                col++;
                dot.setLocationCells(col);
                dot.checkYourself(num);
            } else {
                break;
            }
        }
    }
}
