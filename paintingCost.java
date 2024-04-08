import java.util.Scanner;
public class paintingCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inter = sc.nextInt();
        int out = sc.nextInt();

        double intAns = 0;
        double outAns = 0;

        for(int i = 0; i < inter; i++) {
            double num = sc.nextDouble();
            intAns += (num * 18); 
        }

        for(int i = 0; i < out; i++) {
            double num = sc.nextDouble();
            outAns += (num * 12);
        }

        System.out.println("The ans is: " + (float)(outAns + intAns));
    }
}
