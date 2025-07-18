import java.util.Scanner;

public class A31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter perimeter of square (in meters): ");
        int perimeter = sc.nextInt();

        int side = perimeter / 4;
        int area = side * side;

        System.out.println("Area of square: " + area + " m²");

        sc.close();
    }
}
