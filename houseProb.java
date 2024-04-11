import java.util.*;

public class houseProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
    
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int key : map.keySet()){
            if(key % 2 == 0){
                System.out.println(map.get(key));
            }
        } 
    }
}
