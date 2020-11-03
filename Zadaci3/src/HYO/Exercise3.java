package HYO;

public class Exercise3 {
    public static void main(String[] args) {
        try {
            int arrayLength = 5;
            int[] arrayToOverflow = new int[arrayLength];
            int loopTimes = 10;
            for (int i=0; i<loopTimes; i++) {
                arrayToOverflow[i] = i;
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}