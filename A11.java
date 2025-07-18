import java.util.Scanner;

public class A11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ratio of Base: ");
        int rBase = sc.nextInt();

        System.out.print("Ratio of Height: ");
        int rHeight = sc.nextInt();

        System.out.print("Area (m²): ");
        int area = sc.nextInt();

        double k = Math.sqrt((2.0 * area) / (rBase * rHeight));

        double base = rBase * k;
        double height = rHeight * k;

        System.out.println("Base: " + base + " m");
        System.out.println("Height: " + height + " m");

        sc.close();
    }
}
