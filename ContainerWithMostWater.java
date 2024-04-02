import java.util.Scanner;

public class ContainerWithMostWater {

    static int mostWater(int[] heights){
        int i = 0;
        int j = heights.length-1;
        int ans = 0;

        while(i < j){
            ans = Math.max(ans, (Math.min(heights[i], heights[j])*Math.abs(i-j)));
            if(heights[i] < heights[j]){
                i++;
            }
            else if(heights[i] > heights[j]){
                j--;
            }
            else{
                i++;
                j--;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[9];

        for(int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextInt();
        }

        int ans = mostWater(heights);
        System.out.println(ans);
    }
}
