import java.util.HashMap;
import java.util.Map;

/**
 * 借助map的检索特性减少遍历次数
 */
public class Solution1 {

    public static void main(String[] args) {

        int []nums = {2, 7, 11, 15};
        int target = 9;

        int[] ints = twoSum(nums, target);

        System.out.println(ints[0]+"--"+ints[1]);
    }


    private static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> tracer = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(tracer.containsKey(num)){
                int value = tracer.get(num);
                return new int[]{value,i};
            }else{
                tracer.put(target-num,i);
            }
        }
        return new int[]{};
    }
}
