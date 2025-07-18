import java.util.Scanner;

public class A15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shelly's garden length: ");
        int shellyLength = sc.nextInt();

        System.out.print("Shelly's garden breadth: ");
        int shellyBreadth = sc.nextInt();

        System.out.print("Rachel's garden side: ");
        int rachelSide = sc.nextInt();

        int shellyArea = shellyLength * shellyBreadth;
        int rachelArea = rachelSide * rachelSide;

        if (shellyArea > rachelArea) {
            System.out.println("Shelly's garden is bigger by " + (shellyArea - rachelArea) + " m²");
        } else {
            System.out.println("Rachel's garden is bigger by " + (rachelArea - shellyArea) + " m²");
        }

        sc.close();
    }
}
