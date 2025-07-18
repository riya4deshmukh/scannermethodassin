import java.util.Scanner;

public class A41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diameter (in cm): ");
        double diameter = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        double height = sc.nextDouble();

        double radius = diameter / 2;

        double volume = Math.PI * radius * radius * height;

        System.out.println("Volume of Cylinder: " + volume + " cm³");

        sc.close();
    }
}
