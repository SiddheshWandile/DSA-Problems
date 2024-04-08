import java.util.*;
public class changeTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int x = sc.nextInt();

        int curr = ((h * 60) + m) + (x*60);
        int newVal = (h1 * 60) + m1; 

        int diff = curr - newVal;

        System.out.println("The diff is: " + diff);

    }
}