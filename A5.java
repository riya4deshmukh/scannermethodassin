import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total Cost: ");
        int cost = sc.nextInt();

        System.out.print("Rate per sq meter: ");
        double rate = sc.nextDouble();

        System.out.print("Length: ");
        int length = sc.nextInt();

        double area = cost / rate;
        double breadth = area / length;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area: " + area + " sq meters");
        System.out.println("Breadth: " + breadth + " meters");
        System.out.println("Perimeter: " + perimeter + " meters");

        sc.close();
    }
}
