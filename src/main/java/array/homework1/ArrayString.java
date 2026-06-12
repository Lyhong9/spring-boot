package array.homework1;

public class ArrayString {
    public static void main(String[] args) {

        String[] arrStr = new String[5];

        arrStr[0] = "A";
        arrStr[1] = "B";
        arrStr[2] = "C";
        arrStr[3] = "D";
        arrStr[4] = "E";


        for (int i = 0; i < arrStr.length; i++) {
            System.out.println(arrStr[i]);
        }

        for (String item : arrStr) {
            System.out.println(item);
        }

    }
}
