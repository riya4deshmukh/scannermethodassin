import java.util.Scanner;

public class A30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter tile length (cm): ");
        int tileLength = sc.nextInt();

        System.out.print("Enter tile width (cm): ");
        int tileWidth = sc.nextInt();

        System.out.print("Enter floor length (cm): ");
        int floorLength = sc.nextInt();

        System.out.print("Enter floor width (cm): ");
        int floorWidth = sc.nextInt();

        int tileArea = tileLength * tileWidth;
        int floorArea = floorLength * floorWidth;

        int numberOfTiles = floorArea / tileArea;

        System.out.println("Tiles needed: " + numberOfTiles);

        sc.close();
    }
}
