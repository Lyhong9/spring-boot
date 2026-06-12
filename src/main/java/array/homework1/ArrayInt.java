package array.homework1;

public class ArrayInt {
    public static void main(String[] args) {

        int[] arrInt = new int[4];

        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        arrInt[3] = 4;

        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }

        for (int item : arrInt) {
            System.out.println(item);
        }

    }
}
