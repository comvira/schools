package homework1;

public class DotCom {
    private int[] locations = new int[7];
    private int startNum = 0;
    int locationCells;
    int numOfHits = 0;

    public void mRandom() {
        this.startNum = (int) (Math.random() * 6);
        if (startNum == 6 || startNum == 5 || startNum == 4) {
            locations[6] = 7;
            locations[5] = 6;
            locations[4] = 5;
        } else {
            locations[startNum] = startNum + 1;
            startNum++;
            locations[startNum] = startNum + 1;
            startNum++;
            locations[startNum] = startNum + 1;
        }
    }

    public void setLocationCells(int Iocs) {

        locationCells = Iocs;
    }

    public void checkYourself(int stringGuess) {
        int guess = stringGuess;
        String result = "Мимо";
        for (int cell : locations) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                if (numOfHits == 3) {
                    result = "Потопил";
                    System.out.println(result);
                    System.out.println("количество попыток - " + locationCells);
                    System.exit(0);
                }
                break;
            }
        }
        System.out.println(result);
    }
}
