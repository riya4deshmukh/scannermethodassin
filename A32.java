import java.util.Scanner;

public class A32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of the garden (in meters): ");
        int gardenSide = sc.nextInt();

        System.out.print("Enter side of the pool (in meters): ");
        int poolSide = sc.nextInt();

        int gardenArea = gardenSide * gardenSide;
        int poolArea = poolSide * poolSide;

        int finalArea = gardenArea - poolArea;

        System.out.println("Final garden area (excluding pool): " + finalArea + " m²");

        sc.close();
    }
}
