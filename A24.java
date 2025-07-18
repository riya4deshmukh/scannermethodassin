import java.util.Scanner;

public class A24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Brick size (L×W×H in cm): ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();

        System.out.print("Wall size (L×W×H in cm): ");
        double wl = sc.nextDouble();
        double ww = sc.nextDouble();
        double wh = sc.nextDouble();

        double brickVolume = l * w * h;
        double wallVolume = wl * ww * wh;

        int numberOfBricks = (int)(wallVolume / brickVolume);
        double cost = (numberOfBricks / 1000.0) * 900;

        System.out.println("Bricks needed: " + numberOfBricks);
        System.out.println("Total cost: ₹" + cost);

        sc.close();
    }
}
