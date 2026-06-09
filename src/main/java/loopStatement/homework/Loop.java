package loopStatement.homework;

public class Loop {
    public static void main(String[] args) {
        int result = 1;

        for (int i = 1; i <= 5; i++) {
            result = result * i;
        }

        System.out.println("Result: " + result);

        int resultSum = 0;

        for (int i = 20; i >= 5; i-=5) {
            resultSum = resultSum + i;
        }

        System.out.println("ResultSum: " + resultSum);
    }
}
