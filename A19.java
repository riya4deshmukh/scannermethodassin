import java.util.Scanner;

public class A19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cube side (cm): ");
        int side = sc.nextInt();

        System.out.print("Cuboid length (cm): ");
        int length = sc.nextInt();

        System.out.print("Cuboid breadth (cm): ");
        int breadth = sc.nextInt();

        System.out.print("Cuboid height (cm): ");
        int height = sc.nextInt();

        int cubeVolume = side * side * side;
        int cuboidVolume = length * breadth * height;

        if (cubeVolume > cuboidVolume) {
            System.out.println("Cube has more volume: " + cubeVolume + " cm³");
        } else {
            System.out.println("Cuboid has more volume: " + cuboidVolume + " cm³");
        }

        sc.close();
    }
}
