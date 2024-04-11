import java.util.Scanner;

public class moveZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int idx = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                idx++;
            }
            else{
                int temp = arr[i];
                arr[i] = 0;
                arr[i-idx] = temp; 
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
