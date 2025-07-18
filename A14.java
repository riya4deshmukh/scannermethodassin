import java.util.Scanner;

public class A14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diagonal (m): ");
        int diagonal = sc.nextInt();

        System.out.print("Height 1 (m): ");
        int h1 = sc.nextInt();

        System.out.print("Height 2 (m): ");
        int h2 = sc.nextInt();

        double area = 0.5 * diagonal * (h1 + h2);

        System.out.println("Area of field: " + area + " m²");

        sc.close();
    }
}
