import java.util.*;
public class countVDS {

    static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }

    static boolean isDigit(char ch){
        if(ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int v = 0;
        int d = 0;
        int s = 0;

        for(int i = 0; i < str.length(); i++){
            if(isVowel(str.charAt(i))){
                v += 1;
            }
            else if(isDigit(str.charAt(i))){
                d += 1;
            }
            else {
                if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))){
                    s += 1;
                }
            }
        }

        System.out.println("The total Digits are: " + d);
        System.out.println("The total vowels are: " + v);
        System.out.println("The total special charcters are: " + s);
    }
}
