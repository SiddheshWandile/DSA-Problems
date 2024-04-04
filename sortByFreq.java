import java.util.*;
public class sortByFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : arr){
            map.put(num, map.getOrDefault(num,  0) + 1);   
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b)-> {
            return map.get(a) == map.get(b)? b-a : map.get(a) - map.get(b);
        });
        
        int[] ans = new int[arr.length];
        int x = 0;
        for(int i : list){
            for(int j = 0; j < map.get(i); j++){
                ans[x] = i;
                System.out.println(ans[x] + " ");
                x++;
            }
        }
    }
}
