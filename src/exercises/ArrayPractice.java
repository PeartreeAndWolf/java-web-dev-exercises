package exercises;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int ints : integerArray) {
            if (ints / 2 != 0) {
                System.out.println(ints);
            }

        }
    }
}
