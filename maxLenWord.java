import java.util.Scanner;

public class maxLenWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] ans = str.split(" ");

        int max = 0;
        for(int i = 0; i < ans.length; i++){
            if(max < ans[i].length()){
                max = ans[i].length();
            }
        }

        System.out.println(max);

    }
}
