import java.util.*;
public class removeElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter a elemets in array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a Element which remove in array: ");
        int val = sc.nextInt();

        int k = 0;
        System.out.println("Answer");
        for(int i = 0; i < n; i++){
            if(arr[i] != val){
                arr[k] = arr[i];
                System.out.print(arr[k] + " ");
            }
        }
    }
}
