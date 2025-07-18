import java.util.Scanner;

public class A38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diameter (in cm): ");
        double diameter = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        double h = sc.nextDouble();

        double r = diameter / 2;
        double area = 2 * Math.PI * r * (r + h);

        System.out.println("Surface area: " + area + " cm²");

        sc.close();
    }
}
