package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip>lastInRow){
            System.out.println("number to skip is bigger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            int skipSum = 0;
            int lastSum = 0;
            int num = 0;
            for (int i = 0; i <= numberToSkip; i++) {
                skipSum = skipSum + i;
                num = i;
            }
            for (int j = num + 1; j <= lastInRow; j++) {
                lastSum = lastSum + j;
            }
            System.out.println("skipped sum is " + skipSum);
            System.out.println("counted sum is " + lastSum);
        }
    }
}
