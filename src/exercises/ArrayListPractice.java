package exercises;

import java.util.ArrayList;

public class ArrayListPractice {

    public static int sumEven(ArrayList<Integer> numberArray) {
        int total = 0;
        for (int integer : numberArray) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public static void wordFive(ArrayList<String> words) {
//        String fiveLetters = "";
        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);

            }
        }
//        return fiveLetters;
    }


    public static void main(String[] args) {

        ArrayList<Integer> numberArray = new ArrayList<>();
        numberArray.add(51);
        numberArray.add(15);
        numberArray.add(2);
        numberArray.add(1);
        numberArray.add(5);
        numberArray.add(3);
        numberArray.add(4);
        numberArray.add(6);
        numberArray.add(8);
        numberArray.add(1);
        numberArray.add(55);
        numberArray.add(9);
        numberArray.add(22);
        numberArray.add(20);

        System.out.println(sumEven(numberArray));

        ArrayList<String> words = new ArrayList<>();
        words.add("cat");
        words.add("dog");
        words.add("lion");
        words.add("mouse");
        words.add("skunk");


        wordFive(words);


    }
}