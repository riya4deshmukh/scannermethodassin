import java.util.Scanner;

public class A42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diagonal of square table (in cm): ");
        double diagonal = sc.nextDouble();

        System.out.print("Enter side of square base (in cm): ");
        double side = sc.nextDouble();

         
        double radius = Math.sqrt((diagonal * diagonal) - (side * side));

        double area = Math.PI * radius * radius;
        double cost = area * 10;

        System.out.println("Radius: " + radius + " cm");
        System.out.println("Polishing cost: ₹" + cost);

        sc.close();
    }
}
