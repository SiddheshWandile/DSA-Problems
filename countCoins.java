import java.util.Scanner;
public class countCoins {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();

        int one = 0;
        int two = 0;
        int five = (num - 4)/5;

        if(((num - 5*five) % 2) == 0){
            one = 2;
        }
        else{
            one = 1;
        }

        two = (num - 5*five-one)/2;

        System.out.println(one+two+five);
        System.out.println(five);
        System.out.println(two);
        System.out.println(one);
    }
}
