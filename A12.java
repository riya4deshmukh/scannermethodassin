import java.util.Scanner;

public class A12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hypotenuse (cm): ");
        int hypotenuse = sc.nextInt();

        System.out.print("One side (cm): ");
        int side1 = sc.nextInt();

        int side2 = (int) Math.sqrt(hypotenuse * hypotenuse - side1 * side1);
        double area = 0.5 * side1 * side2;

        System.out.println("Other side: " + side2 + " cm");
        System.out.println("Area: " + area + " cm²");

        sc.close();
    }
}
