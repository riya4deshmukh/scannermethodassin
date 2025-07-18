import java.util.Scanner;

public class A21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Brick length (cm): ");
        int bl = sc.nextInt();

        System.out.print("Brick breadth (cm): ");
        int bb = sc.nextInt();

        System.out.print("Brick height (cm): ");
        int bh = sc.nextInt();

        System.out.print("Wall length (m): ");
        int wl = sc.nextInt();

        System.out.print("Wall breadth (m): ");
        int wb = sc.nextInt();

        System.out.print("Wall height (m): ");
        int wh = sc.nextInt();

        int brickVol = bl * bb * bh;
        int wallVol = (wl * 100) * (wb * 100) * (wh * 100);

        int bricks = wallVol / brickVol;

        System.out.println("Number of bricks needed: " + bricks);

        sc.close();
    }
}
