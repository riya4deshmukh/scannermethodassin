import java.util.Scanner;

public class A34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base1 of the trapezium (in meters): ");
        int base1 = sc.nextInt();

        System.out.print("Enter base2 of the trapezium (in meters): ");
        int base2 = sc.nextInt();

        System.out.print("Enter height of the trapezium (in meters): ");
        int height = sc.nextInt();

        System.out.print("Enter walkway width (in meters): ");
        int walkway = sc.nextInt();

        double area = 0.5 * (base1 + base2) * height;
        double finalArea = area + (walkway * (base1 + base2) / 2.0);

        System.out.println("Total area with walkway: " + finalArea + " m²");

        sc.close();
    }
}
