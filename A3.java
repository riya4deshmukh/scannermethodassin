import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  int tl, tb, rl, rb;
        System.out.print("Tile Length: ");
        tl = sc.nextInt();
   System.out.print("Tile Breadth: ");
        tb = sc.nextInt();
  System.out.print("Room Length: ");
        rl = sc.nextInt();
   System.out.print("Room Breadth: ");
   
        rb = sc.nextInt();

        int ta = tl * tb;
        int ra = rl * rb;
        int tiles = ra / ta;

        System.out.println("total tiles: " + tiles);

        sc.close();
    }
}
