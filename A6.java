import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Side 1: ");
        int side1 = sc.nextInt();

        System.out.print("Side 2: ");
        int side2 = sc.nextInt();

        System.out.print("Perimeter: ");
        int perimeter = sc.nextInt();

        int side3 = perimeter - side1 - side2;
        int semi = perimeter / 2;

        double area = Math.sqrt(semi * (semi - side1) * (semi - side2) * (semi - side3));

        System.out.println("Side 3: " + side3);
        System.out.println("Semi-perimeter: " + semi);
        System.out.println("Area: " + area);

        sc.close();
    }
}
