import java.util.Scanner;

public class A33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the garden (in meters): ");
        int length = sc.nextInt();

        System.out.print("Enter height of the garden (in meters): ");
        int height = sc.nextInt();

        System.out.print("Enter width of path along height: ");
        int path1 = sc.nextInt();

        System.out.print("Enter width of path along length: ");
        int path2 = sc.nextInt();

        int totalArea = length * height;
        int pathArea = (path1 * height) + (path2 * length) - (path1 * path2);
        int usableArea = totalArea - pathArea;

        System.out.println("Usable garden area: " + usableArea + " m²");

        sc.close();
    }
}
