import java.util.*;
public class changeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c =  sc.next();

        String one = "";
        for(int i = 0; i < a.length();i++){
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u'){
                one += '%';
            } 
            else{
                one += a.charAt(i);
            }
        }

        String two = "";
        for(int i = 0; i < b.length(); i++){
            if(b.charAt(i) == 'b' || b.charAt(i) == 'c' || b.charAt(i) == 'd' || b.charAt(i) == 'f' || b.charAt(i) == 'g'){
                two += '#';
            }
            else{
                two += b.charAt(i);
            }
        }

        String three = "";
        for(int i = 0; i < c.length(); i++){
            if(c.charAt(i) >= 'a' && c.charAt(i) <= 'z'){
                three +=  (char)(c.charAt(i) - 32);
            }
            else{
                three += c.charAt(i);
            }
        }
        
        System.out.println(one + " " + two + " " + three);
    }
}
