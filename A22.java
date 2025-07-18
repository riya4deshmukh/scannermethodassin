import java.util.Scanner;

public class A22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length of pond (m): ");
        int length = sc.nextInt();

        System.out.print("Width of pond (m): ");
        int width = sc.nextInt();

        System.out.print("Depth of pond (m): ");
        int depth = sc.nextInt();

        int volume = length * width * depth;

        System.out.println("Capacity of the pond: " + volume + " m³");

        sc.close();
    }
}
