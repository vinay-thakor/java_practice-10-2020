package ifstatement;
/*
 how to check the value in array with duplicate number
 */

public class ArrayPractice {

    public static void main(String[] args) {

        int[] numberList = {10, 5, 10, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 11, 12, 12};

        for (int i = 0; i < numberList.length; i++) {
            int count = 0;
            for (int j = 0; j < numberList.length; j++) {
                if (numberList[i] == numberList[j]) {
                    count = count + 1;
                }
            }
            System.out.println(numberList[i] + "repeats " + count + "times");
        }
    }
}