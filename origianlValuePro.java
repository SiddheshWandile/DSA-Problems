import java.util.*;
public class origianlValuePro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int mul = 1;
        int sum = 0;

        while(num > 0){
            int rem = num % 10;
            mul *= rem;
            sum += rem; 
            num = num / 10;
        }

        System.out.println(Math.abs(mul-sum));

    }
}
