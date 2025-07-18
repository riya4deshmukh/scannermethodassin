import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base (cm): ");
        int base = sc.nextInt();

        System.out.print("Area (cm²): ");
        int area = sc.nextInt();

        int height = (2 * area) / base;

        System.out.println("Height: " + height + " cm");

        sc.close();
    }
}
