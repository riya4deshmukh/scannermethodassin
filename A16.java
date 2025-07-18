 import java.util.Scanner;

public class A16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length (m): ");
        int length = sc.nextInt();

        System.out.print("Width (m): ");
        int width = sc.nextInt();

        int area = length * width;

        System.out.println("Carpet needed: " + area + " m²");

        sc.close();
    }
}
