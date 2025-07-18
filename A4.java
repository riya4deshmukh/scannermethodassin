import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length: ");
        double length = sc.nextDouble();

        System.out.print("Width: ");
        double width = sc.nextDouble();

        System.out.print("Rate per 100 sq.m: ");
        double rate = sc.nextDouble();

        double area = length * width;
        double areaSqM = area / 100.0;
        double cost = areaSqM * rate;

        System.out.println("Total cost: $" + cost);

        sc.close();
    }
}
