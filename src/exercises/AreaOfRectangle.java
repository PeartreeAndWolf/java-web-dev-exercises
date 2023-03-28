package exercises;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        int a = sc.nextInt();
        System.out.print("Enter the length of the rectangle: ");
        int b = sc.nextInt();
        int c = a * b;
        System.out.println("Total= " + c);
    }
}

