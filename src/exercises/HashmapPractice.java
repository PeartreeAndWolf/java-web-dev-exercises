package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapPractice {
    public static void main(String[] args) {

//        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        HashMap<String, Integer> classRoster = new HashMap<>();

        System.out.println("Enter your student name (or ENTER to finish):");

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.put(newStudent, newID);

                input.nextLine();
            }
        } while (!newStudent.equals(""));

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<String, Integer> student : classRoster.entrySet()) {
            System.out.println(student.getKey() + "'s ID: " + student.getValue());
        }

        System.out.println("Number of students in roster: " + classRoster.size());
    }
}
