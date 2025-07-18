import java.util.Scanner;

class A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the perimeter  ");
        int perimeter = scanner.nextInt();

        System.out.print("Enter the length   ");
        int length = scanner.nextInt();

        int breadth = (perimeter / 2) - length;
        int area = length * breadth;

        System.out.println("Breadth " + breadth);
        System.out.println("Area " + area);

        scanner.close();
    }
}
