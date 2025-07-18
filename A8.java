import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Height: ");
        double h = sc.nextDouble();

        System.out.print("Area: ");
        double a = sc.nextDouble();

        double b = (2 * a) / h;

        System.out.println("Base: " + b + " cm");

        sc.close();
    }
}
