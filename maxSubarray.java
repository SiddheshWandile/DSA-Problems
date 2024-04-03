import java.util.*;
public class maxSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int curr = 0;  //end
        int max = Integer.MIN_VALUE; //so-far

        for(int i = 0; i < n; i++){
            curr += arr[i];
            max = Math.max(max, curr);

            if(curr < 0){
                curr = 0;
            }
        }

        System.out.println(max);
    }
}
