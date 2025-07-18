import java.util.Scanner;

public class A23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Side of cube (cm): ");
        int side = sc.nextInt();

        System.out.print("Carton length (cm): ");
        int length = sc.nextInt();

        System.out.print("Carton width (cm): ");
        int width = sc.nextInt();

        System.out.print("Carton height (cm): ");
        int height = sc.nextInt();

        int cubeVolume = side * side * side;
        int cartonVolume = length * width * height;

        int numberOfCubes = cartonVolume / cubeVolume;

        System.out.println("Number of cubical boxes: " + numberOfCubes);

        sc.close();
    }
}
