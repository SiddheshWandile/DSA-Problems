import java.util.Scanner;

public class covertProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pro = 1;

        while(num % 3 != 0){
            num -= 2;
            pro *= 2;
        }

        System.out.println(pro * Math.pow(3, num/3));
    }
}
