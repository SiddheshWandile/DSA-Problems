import java.util.Scanner;
public class directionCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char c = 'R';
        int dist = 10;
        int x = 0;
        int y = 0;

        while(num > 0){
            switch (c) {
                case 'R':
                    x = x + dist;
                    dist = dist + 10;
                    c = 'U';
                    break;
            
                case 'U':
                    y = y + dist;
                    dist = dist + 10;
                    c = 'L';
                    break;

                case 'L':
                    x = x - dist;
                    dist = dist + 10;
                    c = 'D';
                    break;

                case 'D':
                    y = y - dist;
                    dist = dist + 10;
                    c = 'A';
                    break;
                    
                case 'A':
                    x = x + dist;
                    dist = dist + 10;
                    c = 'R';
                    break;
            }
            num--;
        }

        System.out.println(x +" " + y);
    }
}
