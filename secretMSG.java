import java.util.*;
public class secretMSG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = new String();

        for(int i = 0; i < str.length(); i++){
            int ch = str.charAt(i);
            if(ch <= 'u'){
                ans = ans + (char)(ch + 5);
            }  
            else{
                ans = ans + (char)(ch - 'v' + 'a');
            }
        }

        System.out.println(ans);
    }
}