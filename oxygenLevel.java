import java.util.*;
public class oxygenLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        int[] avg = new int[3];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                avg[i] += arr[j][i];
            }
            max = Math.max(max, avg[i]);
        }

        for(int i = 0; i < 3; i++){
            if(avg[i] < 70){
                System.out.println("All Player are Unhealthy");
                break;
            }
            else if(max == avg[i]){
                System.out.println("Max Oxy Player: " + (i+1));
            }
        }
    }
}
