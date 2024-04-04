import java.util.*;
public class FirstOccurStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a original String: ");
        String ori = sc.next();
        System.out.println("Enter a sec String: ");
        String sec = sc.next();


        int orilen = ori.length();
        int seclen  = sec.length();

        for(int i = 0; i <= orilen-seclen; i++) {
            int j = 0;
            while(j < seclen && ori.charAt(i+j) == sec.charAt(j)) {
                j++;
            }
            if(j == seclen) {
                System.out.println(i);
            }
        }
    }
}
