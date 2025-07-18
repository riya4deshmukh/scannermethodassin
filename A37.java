import java.util.Scanner;

public class A37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter surface area (in cm²): ");
        double area = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        double h = sc.nextDouble();

        for (double r = 1; r <= 100; r += 0.01) {
            double sa = 2 * Math.PI * r * (r + h);
            if (Math.abs(sa - area) < 0.5) {
                System.out.println("Radius ≈ " + Math.round(r * 100.0) / 100.0 + " cm");
                System.out.println("Diameter ≈ " + Math.round(2 * r * 100.0) / 100.0 + " cm");
                break;
            }
        }

        sc.close();
    }
}
