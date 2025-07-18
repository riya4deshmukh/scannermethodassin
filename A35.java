import java.util.Scanner;

public class A35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius (in cm): ");
        double r = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        double h = sc.nextDouble();

        double area = 2 * Math.PI * r * (r + h);

        System.out.println("Surface area: " + area + " cm²");

        sc.close();
    }
}
