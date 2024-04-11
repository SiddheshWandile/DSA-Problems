import java.util.*;
public class bikerCrossRoad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[] arr = new int[n];

        // for(int i = 0; i < n; i++){
        //     arr[i] = sc.nextInt();
        // }

        // int sum = 0;

        // for(int i = n - 1; i >= 0; i--){
        //     if(arr[i] != 0){
        //         sum++;
        //         arr[i] = sum;
        //     }
        // }
        // sum = 0;
        // int zero = 0;
        // for(int i = 0; i < n; i++){
        //     if(arr[i] == 0){
        //         zero++;
        //     }
        //     if(zero > 0 && arr[i] != 0){
        //         sum += arr[i] * zero;
        //         zero = 0;
        //     }
        // }
        // System.out.println(sum);
        int sum = 0;
        int c = 0;
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(num == 1){
                sum += c;
            }
            else{
                c++;
            }
        }

        System.out.println(sum);
    }
}
