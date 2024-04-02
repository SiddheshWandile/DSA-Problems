/**
 * 205IsomorphicStrings
 */
import java.util.*;
public class IsomorphicStrings {

    public static boolean IsoString(String s, String t){
        int[] str1 = new int[256];
        int[] str2 = new int[256];

        for(int i = 0; i < s.length(); i++){
            if(str1[s.charAt(i)] != str2[t.charAt(i)]){
                return false;
            }
            str1[s.charAt(i)] = i + 1;
            str2[t.charAt(i)] = i + 1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        
        System.out.println(IsoString(s, t));

    }
}