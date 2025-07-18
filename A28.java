import java.util.Scanner;

public class A28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter room length (m): ");
        int length = sc.nextInt();

        System.out.print("Enter room width (m): ");
        int width = sc.nextInt();

        System.out.print("Enter carpet rate per m² (₹): ");
        int rate = sc.nextInt();

        int cost = length * width * rate;

        System.out.println("Carpet cost: ₹" + cost);

        sc.close();
    }
}
