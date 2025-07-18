import java.util.Scanner;

public class A27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter wall length (m): ");
        int length = sc.nextInt();

        System.out.print("Enter wall height (m): ");
        int height = sc.nextInt();

        System.out.print("Enter tiling rate per m² (₹): ");
        int rate = sc.nextInt();

        int cost = length * height * rate;

        System.out.println("Cost of tiling: ₹" + cost);

        sc.close();
    }
}
