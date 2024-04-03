import java.util.Scanner;

public class totalLegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int legs = sc.nextInt();

        int y = (legs - 2*total) / 2;
        int x = total - y;

        System.out.println("Total Number of Animals with 2 legs are " + x );
        System.out.println("Total Number of Animals with 4 legs are " + y );
    }
}
