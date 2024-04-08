import java.util.*;
public class digitToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        String bin = Integer.toBinaryString(num);
        String conv = "";
        for(char ch : bin.toCharArray()){
            if(ch == '0'){
                conv += 1;
            }
            else{
                conv += 0;
            }
        }
        System.out.println(Integer.parseInt(conv, 2));
    }
}
