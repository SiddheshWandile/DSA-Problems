import java.util.Scanner;
public class maxCarParked {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        int max = 0;
        int row = 0;

        for(int i = 0; i < m; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
                if(sum > max){
                    max = sum;
                    row = i + 1;
                }
            }
        }
        System.out.println("The maximum row parked in a row is " + row);
    }
}