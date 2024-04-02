import java.util.*;

public class twoSum {
    public static int[] TwoSumFunc(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int rem = target - nums[i];

            if(map.containsKey(rem)){
                return new int[]{map.get(rem), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Target value: ");
        int target = sc.nextInt();

        for(int i = 0; i < nums.length; i++) {
            System.out.println("Enter a Value of Array: ");
            nums[i] = sc.nextInt();
        }

        int[] result = TwoSumFunc(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
