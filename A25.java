import java.util.Scanner;

public class A25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brick length (cm): ");
        int brickLength = sc.nextInt();

        System.out.print("Enter brick width (cm): ");
        int brickWidth = sc.nextInt();

        System.out.print("Enter number of bricks: ");
        int numberOfBricks = sc.nextInt();

        int area = brickLength * brickWidth * numberOfBricks;

        System.out.println("Area of the path: " + area + " cm²");

        sc.close();
    }
}
