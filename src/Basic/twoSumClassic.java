package Basic;
import java.util.HashMap;

class twoSumClassic {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        for(int i = 0;i<nums.length;i++) {
            int x = target - nums[i];
            //if comp exists
            if(map.containsKey(x)) { //contains the value
                arr[0] = i;
                arr[1] = map.get(x);//get the index, which is marked as the value
                System.out.println();
                return arr;
            } else {
                //key is index, value is the num[i]
                map.put(nums[i], i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,5};
        int target = 4;
        System.out.println(twoSum(nums, target));
        twoSum(nums, target);
    }
}

