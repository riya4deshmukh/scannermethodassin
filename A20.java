import java.util.Scanner;

public class A20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length (cm): ");
        int length = sc.nextInt();

        System.out.print("Width (cm): ");
        int width = sc.nextInt();

        System.out.print("Height (cm): ");
        int height = sc.nextInt();

        int volume = length * width * height;

        System.out.println("Volume of ice-cream brick: " + volume + " cm³");

        sc.close();
    }
}
