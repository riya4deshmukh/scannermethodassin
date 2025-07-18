import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the area");
        int area = scanner.nextInt();

        System.out.print("Enter the breadth  ");
        int breadth = scanner.nextInt();

        int length = area / breadth;
        int perimeter = 2 * (length + breadth);

        System.out.println("Length  rectangle: " + length + "cm");
        System.out.println("Perimeter   rectangle: " + perimeter + "cm");

        scanner.close();
    }
}
