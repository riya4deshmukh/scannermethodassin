import java.util.Scanner;

public class A40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diameter (in cm): ");
        double diameter = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        double height = sc.nextDouble();

        double r = diameter / 2;
        double volume = Math.PI * r * r * height;

        System.out.println("Volume: " + volume + " cm³");

        sc.close();
    }
}
