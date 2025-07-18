import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Side: ");
        double side = sc.nextDouble();

        double area = (side * side) / 2;

        System.out.println("Area: " + area + " cm²");

        sc.close();
    }
}
