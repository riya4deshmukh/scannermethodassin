import java.util.Scanner;

public class A13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Area (cm²): ");
        double area = sc.nextDouble();

        System.out.print("One leg (cm): ");
        double leg1 = sc.nextDouble();

        double leg2 = (2 * area) / leg1;

        System.out.println("Other leg: " + leg2 + " cm");

        sc.close();
    }
}
