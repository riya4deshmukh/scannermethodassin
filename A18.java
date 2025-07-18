import java.util.Scanner;

public class A18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length (m): ");
        int length = sc.nextInt();

        System.out.print("Breadth (m): ");
        int breadth = sc.nextInt();

        int perimeter = 2 * (length + breadth);
        int totalDistance = perimeter * 10;
        double km = totalDistance / 1000.0;

        System.out.println("Total distance jogged: " + km + " km");

        sc.close();
    }
}
