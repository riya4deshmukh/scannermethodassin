import java.util.Scanner;

public class A26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter path length (cm): ");
        int pathLength = sc.nextInt();

        System.out.print("Enter path breadth (cm): ");
        int pathBreadth = sc.nextInt();

        System.out.print("Enter brick length (cm): ");
        int brickLength = sc.nextInt();

        System.out.print("Enter brick breadth (cm): ");
        int brickBreadth = sc.nextInt();

        int pathArea = pathLength * pathBreadth;
        int brickArea = brickLength * brickBreadth;

        int numberOfBricks = pathArea / brickArea;

        System.out.println("Number of bricks needed: " + numberOfBricks);

        sc.close();
    }
}
