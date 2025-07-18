import java.util.Scanner;

public class A17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length (m): ");
        int length = sc.nextInt();

        System.out.print("Width (m): ");
        int width = sc.nextInt();

        int perimeter = 2 * (length + width);

        System.out.println("Ribbon length needed: " + perimeter + " m");

        sc.close();
    }
}
